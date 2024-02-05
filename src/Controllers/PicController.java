package Controllers;

import Entidades.Pic;
import Services.IngredienteService;
import Services.PicService;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class PicController {

    PicService pis = new PicService();
    IngredienteService is = new IngredienteService();

    //ABM
    //ALTA
    public boolean agregarNuevoIngrediente(int idIngre, int idProducto, double cantidad, String unidad) {
        Pic pic = new Pic();
        pic.setId(-1);
        pic.setIdIngre(idIngre);
        pic.setIdProducto(idProducto);
        pic.setCantidad(cantidad);
        pic.setUnidad(unidad);
        pis.agregarPic(pic);
        return true;
    }

    //BAJA
    public void eliminarPic(int id) {
        pis.eliminarPic(id);
    }

    public void eliminarPicDeProducto(int idProducto) {
        pis.eliminarPicDeProducto(idProducto);
    }

    //MODIFICACION
    public void actualizarProducto(ArrayList<Pic> pics) {
        pis.actualizarProducto(pics);
    }

    public boolean actualizarPic(int id, int idIngre, int IdPro, double cantidad,String unidad) {
        Pic pic = new Pic();
        pic.setId(id);
        pic.setIdIngre(idIngre);
        pic.setIdProducto(IdPro);
        pic.setCantidad(cantidad);
        pic.setUnidad(unidad);
        return pis.actualizarPic(pic);
    }

    //Llenar pantalla
    public String[] llenarPantalla(ArrayList<Pic> listaPic) {
        int n = listaPic.size();
        String[] enviar = new String[n];
        for (int i = 0; i < n; i++) {
            double auxiliar = listaPic.get(i).getCantidad();
            String unidad = "";
            String precio = "";
            switch (listaPic.get(i).getUnidad()) {
                case "k":
                    unidad = "kg";
                    auxiliar = auxiliar / 1000;
                    precio = String.valueOf(auxiliar);
                    break;
                case "g":
                    unidad = "gr";
                    precio = String.valueOf(auxiliar);
                    break;
                case "l":
                    unidad = "l";
                    auxiliar = auxiliar / 1000;
                    precio = String.valueOf(auxiliar);
                    break;
                case "c":
                    unidad = "ml";
                    precio = String.valueOf(auxiliar);
                    break;
                case "u":
                    unidad = "unidad";
                    precio = String.valueOf(auxiliar);
                    break;
                case "s":
                    unidad = "cda.";
                    auxiliar = auxiliar / 10;
                    precio = truncarNumero(auxiliar);
                    break;
                case "n":
                    unidad = "cdta.";
                    auxiliar = auxiliar / 5;
                    precio = truncarNumero(auxiliar);
                    break;
            }
            enviar[i] = is.devolverNombre(listaPic.get(i).getIdIngre()) + " - " + precio + unidad;
        }
        return enviar;
    }

    //Devolver los pics de un producto especifico
    public ArrayList<Pic> llenarPics(int idPro) {
        return pis.llenarPics(idPro);
    }

    //Actualizar la lista de pics en el service
    public void actulizarDatos() {
        pis.actualizarLista();
    }

    //Devolver cantidad en base al id
    public String devolverCantidad(int id) {
        double auxiliar = pis.devolverCantidad(id);
        String unidad = pis.devolverUnidad(id);
        switch (unidad) {
            case "k":
                auxiliar = auxiliar / 1000;
                break;
            case "l":
                auxiliar = auxiliar / 1000;
                break;
            case "s":
                auxiliar = auxiliar / 10;
                break;
            case "n":
                auxiliar = auxiliar / 5;
                break;
        }
        return String.valueOf(auxiliar);
    }

    //Devolver el id del ingrediente
    public int devolverIdIngre(int id) {
        return pis.devolverIdIngre(id);
    }

    //Devolver unidad en base al id
    public String devolverUnidad(int id) {
        return pis.devolverUnidad(id);
    }

    //Devolver el indice de la lista en la que se encuentra esa unidad
    public int indiceDelBox(String unidad, ArrayList<String> listaUnidades) {
        int n = listaUnidades.size();
        int indice = -1;
        for (int i = 0; i < n; i++) {
            if (listaUnidades.get(i).equals(unidad)) {
                indice = i;
                break;
            }
        }
        return indice;
    }

    //TRUNCAR NUMERO
    public String truncarNumero(double numero) {
        String pattern = "#";
        DecimalFormat df = new DecimalFormat(pattern);
        String numeroTruncado = df.format(numero);
        return numeroTruncado;
    }
}
