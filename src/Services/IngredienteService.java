package Services;

import Entidades.Ingrediente;
import Serializable.Escritura;
import Serializable.Lectura;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IngredienteService {

    private Escritura escribir = new Escritura();
    private Lectura leer = new Lectura();
    static public ArrayList<Ingrediente> listaIngredientes = new ArrayList();

    public IngredienteService() {
        actualizarLista();
    }

    public void verLista() {
        for (Ingrediente Ingrediente : listaIngredientes) {
            System.out.println(Ingrediente);
        }
    }

    /**
     * ****
     * --ABM-- ****
     */
    //ALTA
    public void agregarIngrediente(Ingrediente ingrediente) {
        int id = -1;
        if (listaIngredientes.isEmpty()) {
            id = 0;
        } else {
            id = listaIngredientes.get(listaIngredientes.size() - 1).getId() + 1;
        }
        ingrediente.setId(id);
        listaIngredientes.add(ingrediente);
        guardarLista();
    }

    //BAJA
    public void eliminarIngrediente(int id) {
        for (Ingrediente ingrediente : listaIngredientes) {
            if (ingrediente.getId() == id) {
                listaIngredientes.remove(ingrediente);
                break;
            }
        }
        guardarLista();
    }

    //MODIFICACION
    public void actualizarIngredientes(int id, String nombre, double precioUnidad, String unidad) {
        for (Ingrediente ingrediente : listaIngredientes) {
            if (ingrediente.getId() == id) {
                ingrediente.setNombre(nombre);
                ingrediente.setPrecioUnidad(precioUnidad);
                ingrediente.setUnidad(unidad);
                break;
            }
        }
        guardarLista();
    }

    /**
     * ****************************************
     * --LECTURA Y ESCRITURA EN LA BASE DE DATOS--
     * ****************************************
     */
    public void actualizarLista() {
        try {
            listaIngredientes = leer.leerListaIngredientes();
        } catch (IOException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void guardarLista() {
        try {
            escribir.guardarDatosIngredientes(listaIngredientes);
        } catch (IOException ex) {
            Logger.getLogger(PicService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * ********
     * --METODOS-- ********
     */
    public double devolverPrecio(int id) {
        double precio = 0;
        for (Ingrediente ingrediente : listaIngredientes) {
            if (ingrediente.getId() == id) {
                precio = ingrediente.getPrecioUnidad();
                break;
            }
        }
        return precio;
    }

    public String devolverNombre(int id) {
        String nombre = "";
        for (Ingrediente ingrediente : listaIngredientes) {
            if (ingrediente.getId() == id) {
                nombre = ingrediente.getNombre();
                System.out.println(nombre);
            }
        }
        return nombre;
    }

    public Ingrediente devolverIngrediente(int id) {
        Ingrediente ingredientes = new Ingrediente();
        for (Ingrediente ingrediente : listaIngredientes) {
            if (ingrediente.getId() == id) {
                ingredientes = ingrediente;
                break;
            }
        }
        return ingredientes;
    }

    public ArrayList<Ingrediente> devolverListaIngredientes() {
        actualizarLista();
        return listaIngredientes;
    }
}
