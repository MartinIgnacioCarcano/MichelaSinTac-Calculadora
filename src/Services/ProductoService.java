package Services;

import Entidades.Producto;
import Serializable.Escritura;
import Serializable.Lectura;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductoService {

    //ATRIBUTOS
    private Escritura escribir = new Escritura();
    private Lectura leer = new Lectura();
    private PicService ps = new PicService();
    static public ArrayList<Producto> listaProductos = new ArrayList();

    public ProductoService() {
        actualizarLista();
    }

    public void verLista() {
        for (Producto listaProducto : listaProductos) {
            System.out.println(listaProducto);
        }
    }

    /**
     * ****
     * --ABM--
    *****
     */
    //ALTA
    public int agregarProducto(Producto producto) {
        int id = 0;
        if (listaProductos.isEmpty()) {
            id = 0;
        } else {
            id = listaProductos.get(listaProductos.size() - 1).getId() + 1;
        }
        producto.setId(id);
        listaProductos.add(producto);
        guardarLista();
        return id;
    }

    //BAJA
    public boolean eliminarProducto(int id) {
        for (Producto ingrediente : listaProductos) {
            if(ingrediente.getId()==id){
                listaProductos.remove(ingrediente);
                break;
            }
        }
        guardarLista();
        return true;
    }
    //MODIFICACION
    public void actualizarProducto(int id, double precio) {
        for (Producto producto : listaProductos) {
            if (producto.getId() == id) {
                producto.setPrecio(precio);
                break;
            }
        }
        guardarLista();
    }

    public void actualizarProducto(int id, String nombre) {
        for (Producto producto : listaProductos) {
            if (producto.getId() == id) {
                producto.setNombre(nombre);
                break;
            }
        }
        guardarLista();
    }

    /**
     * ****************************************
     * --LECTURA Y ESCRITURA EN LA BASE DE DATOS--
    *****************************************
     */
    public void actualizarLista() {
        try {
            listaProductos = leer.leerListaProductos();
        } catch (IOException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void guardarLista() {
        try {
            escribir.guardarDatosProductos(listaProductos);
        } catch (IOException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**********
    --METODOS--
    **********/
    //Calcular Precio
    public double calcularPrecio(int idPro) {
        double aux = -1;
        aux = ps.calcularPrecio(idPro);
        actualizarProducto(idPro, aux);
        guardarLista();
        return aux;
    }
    
    //Devolver nombre en base al id
    public String obtenerNombreById(int id) {
        String nombre = "";
        for (Producto producto : listaProductos) {
            if (producto.getId() == id) {
                nombre = producto.getNombre();
                break;
            }
        }
        return nombre;
    }

    //Devolver precio en base al id
    public String obtenerPrecioById(int id) {
        String precio = "";
        for (Producto producto : listaProductos) {
            if (producto.getId() == id) {
                precio = truncarNumero(producto.getPrecio());
                break;
            }
        }
        return precio;
    }

    //Devolver lista completa
    public ArrayList<Producto> devolverLista() {
        actualizarLista();
        return listaProductos;
    }
    
    
    //Truncar los string para mostrarlos en pantalla
    public String truncarNumero(double numero) {
        String pattern = "#.###";
        DecimalFormat df = new DecimalFormat(pattern);
        String numeroTruncado = df.format(numero);
        return numeroTruncado;
    }
}
