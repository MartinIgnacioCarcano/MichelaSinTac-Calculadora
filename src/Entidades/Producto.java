
package Entidades;

public class Producto implements java.io.Serializable{
    //Atributos
    public int id;
    private String nombre;
    private double precio;

    //CONSTRUCTORES
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String nombre) {
        this.nombre = nombre;
        this.precio = -1;
    }

    public Producto() {
    }

    //GETTERS Y SETTERS
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + '}';
    }

    
    
    
}
