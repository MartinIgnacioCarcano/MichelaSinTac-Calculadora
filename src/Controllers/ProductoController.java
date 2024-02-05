package Controllers;

import Entidades.Pic;
import Entidades.Producto;
import Services.ProductoService;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class ProductoController {

    //ATRIBUTOS
    ProductoService ps = new ProductoService();
    PicController pic = new PicController();

    /**
     * ****
     * --ABM--
    *****
     */
    //ALTA
    public int crearProducto() {
        Producto producto = new Producto("", 0);
        return ps.agregarProducto(producto);
    }

    //BAJA
    public boolean eliminarProducto(int id) {
        ArrayList<Pic> listaPicsEliminar = pic.llenarPics(id);
        for (Pic pic1 : listaPicsEliminar) {
            pic.eliminarPic(pic1.getId());
        }
        return ps.eliminarProducto(id);
    }

    //MODIFICACION.
    public void actualizarDatos(int id) {
        pic.actulizarDatos();
        ps.actualizarLista();
        ps.calcularPrecio(id);
    }

    public void actualizarNombre(int id, String nombre) {
        ps.actualizarProducto(id, nombre);
    }

    /**
     * *********************
     * --DEVOLVER INFORMACION--
    **********************
     */
    //NOMBRE
    public String llenarNombre(int id) {
        return ps.obtenerNombreById(id);
    }

    //PRECIO
    public String llenarPrecio(int id) {
        return ps.obtenerPrecioById(id);
    }

    //LISTA COMPLETA
    public ArrayList<Producto> devolverProductos() {
        return ps.devolverLista();
    }

    /**
     * ********
     * --METODOS--
    *********
     */
    //Llenar pantalla
    public String[] llenarPantalla(ArrayList<Producto> listaProductos, boolean x25) {
        for (Producto producto : listaProductos) {
            ps.calcularPrecio(producto.getId());
        }
        int n = listaProductos.size();
        String[] enviar = new String[n];
        if (x25) {
            for (int i = 0; i < n; i++) {
                String numero = truncarNumero(listaProductos.get(i).getPrecio()*2.5);
                enviar[i] = listaProductos.get(i).getNombre() + "  ---  $" + numero;
            }
        } else {
            for (int i = 0; i < n; i++) {
                String numero = truncarNumero(listaProductos.get(i).getPrecio());
                enviar[i] = listaProductos.get(i).getNombre() + "  ---  $" + numero;
            }
        }
        return enviar;
    }

    //Truncar los string para mostrarlos en pantalla
    public String truncarNumero(double numero) {
        String pattern = "#";
        DecimalFormat df = new DecimalFormat(pattern);
        String numeroTruncado = df.format(numero);
        return numeroTruncado;
    }

    //BUSCADOR
    public ArrayList<Producto> buscar(String buscar, ArrayList<Producto> listaProductos) {
        ArrayList<Producto> enviar = new ArrayList();
        String buscador = buscar.toLowerCase();
        for (Producto producto : listaProductos) {
            String auxiliar = producto.getNombre().toLowerCase();
            if (auxiliar.contains(buscador)) {
                enviar.add(producto);
            }
        }
        return enviar;
    }

}
