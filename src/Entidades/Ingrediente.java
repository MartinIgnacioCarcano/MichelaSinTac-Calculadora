/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author MartinC
 */
public class Ingrediente implements java.io.Serializable {
    //Atributos
    public int id;
    private String nombre;
    private double precioUnidad;
    private String unidad;

    //Constructores
    public Ingrediente() {
    }

    public Ingrediente(String nombre, double precioUnidad, String unidad) {
        this.nombre = nombre;
        this.precioUnidad = precioUnidad;
        this.unidad = unidad;
    }

    //GETTERS Y SETTERS    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ingrediente{" + "id=" + id + ", nombre=" + nombre + ", precioUnidad=" + precioUnidad + ", unidad=" + unidad + '}';
    }
    

    

    

    
    
    
    
    
    
}
