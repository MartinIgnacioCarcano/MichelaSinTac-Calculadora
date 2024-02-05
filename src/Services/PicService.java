package Services;

import Entidades.Pic;
import Serializable.Escritura;
import Serializable.Lectura;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PicService {

    private Escritura escribir = new Escritura();
    private Lectura leer = new Lectura();
    private IngredienteService is = new IngredienteService();
    static public ArrayList<Pic> listaPics = new ArrayList();

    public PicService() {
        actualizarLista();
    }

    public void verLista() {
        for (Pic listaPic : listaPics) {
            System.out.println(listaPic);
        }
    }

    //ABM
    //ALTA
    public void agregarPic(Pic pic) {
        int id = -1;
        if (listaPics.isEmpty()) {
            id = 0;
        } else {
            id = listaPics.get(listaPics.size() - 1).getId() + 1;
        }
        pic.setId(id);
        listaPics.add(pic);
        guardarLista();
    }

    //BAJA
    public void eliminarPic(int id) {
        for (Pic listaPic : listaPics) {
            if (listaPic.getId() == id) {
                listaPics.remove(listaPic);
                break;
            }
        }
        guardarLista();
    }

    public void eliminarPic(Pic pic) {
        listaPics.remove(pic);
        guardarLista();
    }

    public void eliminarPicDeProducto(int idProducto) {
        if (!listaPics.isEmpty()) {
            boolean salir = true;
            int x = 0;
            while (salir) {
                if (x ==( listaPics.size() - 1)) {
                    salir = false;
                    break;
                }else if (listaPics.get(x).getIdProducto() == idProducto) {
                    eliminarPic(listaPics.get(x).getId());
                    break;
                } else{
                    x += 1;
                }
            }
            guardarLista();
        }
    }

    //MODIFICACION
    public boolean actualizarPic(Pic picNuevo){
        for (Pic pic : listaPics) {
            if(picNuevo.getId()==pic.getId()){
                pic.setIdIngre(picNuevo.getIdIngre());
                pic.setIdProducto(picNuevo.getIdProducto());
                pic.setCantidad(picNuevo.getCantidad());
                pic.setUnidad(picNuevo.getUnidad());
                break;
            }
        }
        guardarLista();
        return true;
    }
    
    

    /**
     * ****************************************
     * --LECTURA Y ESCRITURA EN LA BASE DE DATOS--
     * ****************************************
     */
    public void actualizarLista() {
        try {
            listaPics = leer.leerListaPics();
        } catch (IOException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void guardarLista() {
        try {
            escribir.guardarDatosPics(listaPics);
        } catch (IOException ex) {
            Logger.getLogger(PicService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * ********
     * --METODOS-- ********
     */
    public double calcularPrecio(int idPro) {
        double resultado = 0;
        int idIngre;
        double precioUnidad;
        for (Pic pic : listaPics) {
            if (pic.getIdProducto() == idPro) {
                idIngre = pic.getIdIngre();
                precioUnidad = is.devolverPrecio(idIngre);
                System.out.println(precioUnidad);
                resultado += pic.getCantidad() * precioUnidad;
                double aux = pic.getCantidad() * precioUnidad;
            }
        }
        return resultado;
    }

    //Llenar los pics de un producto en particular
    public ArrayList<Pic> llenarPics(int idPro) {
        actualizarLista();
        ArrayList<Pic> pics = new ArrayList();
        for (Pic pic : listaPics) {
            if (pic.getIdProducto() == idPro) {
                pics.add(pic);
            }
        }
        return pics;
    }

    //Cuando cambian algunos valores de un producto
    public void actualizarProducto(ArrayList<Pic> pics) {
        for (Pic pic : pics) {
            for (int i = 0; i < listaPics.size() - 1; i++) {
                if (pic.getId() == listaPics.get(i).getId()) {
                    listaPics.get(i).setIdIngre(pic.getIdIngre());
                    listaPics.get(i).setIdProducto(pic.getIdProducto());
                    listaPics.get(i).setCantidad(pic.getCantidad());
                } else if (pic.getId() == -1) {
                    agregarPic(pic);
                }
            }
        }
        guardarLista();
    }
    
    //Devolver cantidad en base al id
    public double devolverCantidad(int id){
        double devolver = 0;
        for (Pic pic : listaPics) {
            if(pic.getId()==id){
                devolver = pic.getCantidad();
            }
        }
        return devolver;
    }
    
    //Devolver id Ingrediente
    public int devolverIdIngre(int id){
        int idIngrediente = -1;
        for (Pic pic : listaPics) {
            if(pic.getId()==id){
                idIngrediente = pic.getIdIngre();
            }
        }
        return idIngrediente;
    }
    
    //Devolver unidad
    public String devolverUnidad(int id){
        String unidad = "";
        for (Pic pic : listaPics) {
            if(pic.getId()==id){
                unidad = pic.getUnidad();
            }
        }
        return unidad;
    }
}
