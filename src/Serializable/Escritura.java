/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializable;

import Entidades.Ingrediente;
import Entidades.Pic;
import Entidades.Producto;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author MartinC
 */
public class Escritura {

    FileOutputStream fileOut;
    ObjectOutputStream salida;

    //GUARDAR TABLA PRODUCTOS
    public void guardarDatosProductos(ArrayList<Producto> lista) throws FileNotFoundException, IOException {
        try {
            fileOut = new FileOutputStream("ListaProductos.obj");
            salida = new ObjectOutputStream(fileOut);
            salida.writeObject(lista);
        } catch (FileNotFoundException ex) {
            throw ex;
        } catch (IOException ex) {
            throw ex;
        } finally {
            salida.close();
        }
    }
    
    //GUARDAR TABLA INGREDIENTES  
    public void guardarDatosIngredientes(ArrayList<Ingrediente> lista) throws FileNotFoundException, IOException {
        try {
            fileOut = new FileOutputStream("ListaIngredientes.obj");
            salida = new ObjectOutputStream(fileOut);
            salida.writeObject(lista);
        } catch (FileNotFoundException ex) {
            throw ex;
        } catch (IOException ex) {
            throw ex;
        } finally {
            salida.close();
        }

    }
    
    //GUARDAR LA TABLA DE PICS
    public void guardarDatosPics(ArrayList<Pic> lista) throws FileNotFoundException, IOException {
        try {
            fileOut = new FileOutputStream("ListaPics.obj");
            salida = new ObjectOutputStream(fileOut);
            salida.writeObject(lista);
        } catch (FileNotFoundException ex) {
            throw ex;
        } catch (IOException ex) {
            throw ex;
        } finally {
            salida.close();
        }
    }
}
