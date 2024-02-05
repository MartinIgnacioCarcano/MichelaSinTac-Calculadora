package basededatos;

import Controllers.PicController;
import Entidades.Ingrediente;
import Entidades.Pic;
import Entidades.Producto;
import Serializable.Escritura;
import Serializable.Lectura;
import Services.IngredienteService;
import Services.PicService;
import Services.ProductoService;
import VisualIngrediente.ListaIngredientes;
import VisualProducto.ListaProducto;
import VisualProducto.VerProducto;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class BaseDeDatos {

    public static void main(String[] args) throws IOException {

        ProductoService ps = new ProductoService();
        PicService pis = new PicService();
        IngredienteService is = new IngredienteService();
        is.verLista();
        pis.verLista();
        ps.verLista();
        ListaProducto lista = new ListaProducto();
        lista.setVisible(true);
            

//        Escritura escribir = new Escritura();
//        Lectura leer = new Lectura();
//        ArrayList<Ingrediente> listaIngredientes = new ArrayList();
//        ArrayList<Producto> listaProductos = new ArrayList();
//        ArrayList<Pic> listaPics = new ArrayList();
//        
//        Ingrediente ingre = new Ingrediente();
//        ingre.setId(0);
//        ingre.setNombre("Leche en Polvo");
//        ingre.setPrecioUnidad(3.085);
//        ingre.setUnidad("g");
//        
//        Ingrediente ingre1 = new Ingrediente();
//        ingre1.setId(1);
//        ingre1.setNombre("Fecula de Mandioca");
//        ingre1.setPrecioUnidad(1.240);
//        ingre1.setUnidad("g");
//        
//        Ingrediente ingre2 = new Ingrediente();
//        ingre2.setId(2);
//        ingre2.setNombre("Harina de Arroz");
//        ingre2.setPrecioUnidad(0.760);
//        ingre2.setUnidad("g");
//        
//        Ingrediente ingre3 = new Ingrediente();
//        ingre3.setId(3);
//        ingre3.setNombre("Almidon de Maiz");
//        ingre3.setPrecioUnidad(0.690);
//        ingre3.setUnidad("g");
//        
//        Ingrediente ingre4 = new Ingrediente();
//        ingre4.setId(4);
//        ingre4.setNombre("Goma Xantica");
//        ingre4.setPrecioUnidad(42.500);
//        ingre4.setUnidad("g");
//        
//        Ingrediente ingre5 = new Ingrediente();
//        ingre5.setId(5);
//        ingre5.setNombre("COCO");
//        ingre5.setPrecioUnidad(1);
//        ingre5.setUnidad("g");
//        
//        listaIngredientes.add(ingre);
//        listaIngredientes.add(ingre1);
//        listaIngredientes.add(ingre2);
//        listaIngredientes.add(ingre3);
//        listaIngredientes.add(ingre4);
//        listaIngredientes.add(ingre5);
//        
//        Producto pro = new Producto("Brownie");
//        pro.setId(0);
//        
//        
//        listaProductos.add(pro);
//        
//        
//        LECHE EN POLVO
//        Pic pic = new Pic();
//        pic.setId(0);
//        pic.setIdIngre(0);
//        pic.setIdProducto(0);
//        pic.setCantidad(90);
//        pic.setUnidad("g");
//        
//        FECULA DE MANDIOCA
//        Pic pic1 = new Pic();
//        pic1.setId(1);
//        pic1.setIdIngre(1);
//        pic1.setIdProducto(0);
//        pic1.setCantidad(270);
//        
//        HARINA DE ARROZ
//        Pic pic2 = new Pic();
//        pic2.setId(2);
//        pic2.setIdIngre(2);
//        pic2.setIdProducto(0);
//        pic2.setCantidad(270);
//        
//        ALMIDON DE MAIZ
//        Pic pic3 = new Pic();
//        pic3.setId(3);
//        pic3.setIdIngre(3);
//        pic3.setIdProducto(0);
//        pic3.setCantidad(365);
//        
//        GOMA XANTICA
//        Pic pic4 = new Pic();
//        pic4.setId(4);
//        pic4.setIdIngre(4);
//        pic4.setIdProducto(0);
//        pic4.setCantidad(10);
//        
//        Tarta de coco
//        COCO
//        Pic pic5 = new Pic();
//        pic5.setId(5);
//        pic5.setIdIngre(5);
//        pic5.setIdProducto(1);
//        pic5.setCantidad(1000);
//        
//        Marquise
//        LECHE EN POLVO
//        Pic pic6 = new Pic();
//        pic6.setId(6);
//        pic6.setIdIngre(1);
//        pic6.setIdProducto(2);
//        pic6.setCantidad(1000);
//        
//        listaPics.add(pic);
//        listaPics.add(pic1);
//        listaPics.add(pic2);
//        listaPics.add(pic3);
//        listaPics.add(pic4);
//        listaPics.add(pic5);
//        listaPics.add(pic6);
//        
//        escribir.guardarDatosIngredientes(listaIngredientes);
//        escribir.guardarDatosPics(listaPics);
//        escribir.guardarDatosProductos(listaProductos);
//        listaIngredientes = leer.leerListaIngredientes();
//        for (Ingrediente listaIngrediente : listaIngredientes) {
//            System.out.println(listaIngrediente);
//        }
//        
//        listaPics = leer.leerListaPics();
//        for (Pic listaPic : listaPics) {
//            System.out.println(listaPic);
//        }
//        
//        listaProductos = leer.leerListaProductos();
//        for (Producto listaProducto : listaProductos) {
//            System.out.println(listaProducto);
//        }
    }

}
