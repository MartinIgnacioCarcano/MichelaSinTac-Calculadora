package Entidades;

public class Pic implements java.io.Serializable{
    //ATRIBUTOS
    private int id;
    private int idProducto;
    private int idIngre;
    private double cantidad;
    private String unidad;

    //CONSTRUCTORES
    public Pic() {
    }

    public Pic(int id, int idProducto, int idIngre, double cantidad) {
        this.id = id;
        this.idProducto = idProducto;
        this.idIngre = idIngre;
        this.cantidad = cantidad;
    }

    //GETTERS Y SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdIngre() {
        return idIngre;
    }

    public void setIdIngre(int idIngre) {
        this.idIngre = idIngre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "Pic{" + "id=" + id + ", idProducto=" + idProducto + ", idIngre=" + idIngre + ", cantidad=" + cantidad + '}';
    }
    
}
