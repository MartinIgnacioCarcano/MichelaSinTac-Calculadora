/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializable;

import Entidades.Ingrediente;
import Entidades.Pic;
import Entidades.Producto;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MartinC
 */
public class Lectura {
    FileInputStream fileIn;
    ObjectInputStream entrada;
    //Leer la lista de Productos    
    public ArrayList leerListaProductos() throws IOException{
        ArrayList<Producto> lista = new ArrayList();
        try {
            fileIn = new FileInputStream("ListaProductos.obj");
            entrada = new ObjectInputStream(fileIn);
            lista = (ArrayList<Producto>) entrada.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex){
            System.out.println("ClassNotFoundException");
        } finally{
            entrada.close();
        }
        return lista;
    } 
    //Leer la lista de Ingredientes    
    public ArrayList leerListaIngredientes() throws IOException{
        ArrayList<Ingrediente> lista = new ArrayList();
        try {
            fileIn = new FileInputStream("ListaIngredientes.obj");
            entrada = new ObjectInputStream(fileIn);
            lista = (ArrayList<Ingrediente>) entrada.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex){
            System.out.println("ClassNotFoundException");
        } finally{
            entrada.close();
        }
        return lista;
    } 
    //Leer la lista de Pics    
    public ArrayList leerListaPics() throws IOException{
        ArrayList<Pic> lista = new ArrayList();
        try {
            fileIn = new FileInputStream("ListaPics.obj");
            entrada = new ObjectInputStream(fileIn);
            lista = (ArrayList<Pic>) entrada.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex){
            System.out.println("ClassNotFoundException");
        } finally{
            entrada.close();
        }
        return lista;
    } 
}
