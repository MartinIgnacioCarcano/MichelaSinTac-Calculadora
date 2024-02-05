package Controllers;

import Entidades.Ingrediente;
import Services.IngredienteService;
import java.util.ArrayList;

public class IngredienteController {
    //ATRIBUTOS
    IngredienteService is = new IngredienteService();
    PicController pic = new PicController();
    
    //Traer toda la lista de ingredientes
    public ArrayList<Ingrediente> devolverListaIngredientes(){
        return is.devolverListaIngredientes();
    }
    
    //Entregar un array de String
    public String[] llenarPantalla(ArrayList<Ingrediente> listaIngredientes){
        int n = listaIngredientes.size();
        String[] enviar = new String[n];
        for (int i = 0; i < n; i++) {
            enviar[i] = listaIngredientes.get(i).getNombre();
            System.out.println(enviar[i]);
        }
        return enviar;
    }
    
    //Agregar nuevo pic y devolver un boolean para saber cuando actualizar la pantalla
    public boolean agregarNuevoIngrediente(int idIngre,int idProducto, double cantidad, String unidad){
        return pic.agregarNuevoIngrediente(idIngre,idProducto, cantidad,unidad);
    }
    
    //Buscador de ingredientes en base a un string
    public ArrayList<Ingrediente> buscar(String buscar, ArrayList<Ingrediente> listaIngredientes){
        ArrayList<Ingrediente> enviar = new ArrayList();
        String buscador = buscar.toLowerCase();
        for (Ingrediente ingrediente : listaIngredientes) {
            String auxiliar = ingrediente.getNombre().toLowerCase();
            if(auxiliar.contains(buscador)){
                enviar.add(ingrediente);
            }
        }
        return enviar;
    }
    
    //Llenar la pantalla de Ver ingrediente con uno en especifico
    public Ingrediente getElementById(int id){
        return is.devolverIngrediente(id);
    }
    
    //CREAR un nuevo ingrediente
    public void crearIngrediente(Ingrediente ingrediente){
        is.agregarIngrediente(ingrediente);
    }
    
    //actualiza ingrediente
    public void actualizarIngrediente(Ingrediente in){
        is.actualizarIngredientes(in.getId(),in.getNombre() , in.getPrecioUnidad(), in.getUnidad());
    }
    
    //Eliminar ingrediente especifico
    public void eliminarIngrediente(int id) {
        is.eliminarIngrediente(id);
    }
    
    //Buscar el index de la lista en base a su id
    public int buscarIndice(int idIngre, ArrayList<Ingrediente> listaIngredientes){
        int index=-1;
        int n = listaIngredientes.size();
        for (int i = 0; i < n; i++) {
            if(listaIngredientes.get(i).getId()==idIngre){
               index=i;
               break;
            }
        }
        return index;
    }
}
