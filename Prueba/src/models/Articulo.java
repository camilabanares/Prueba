
package models;

public class Articulo {
    private String referencia;
    private String nombre;
    private double precio;

    public Articulo(String referencia, String nombre, double precio) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    
    public String getAtributos(){
        return this.nombre + this.referencia + this.precio;
    }
    public void setAtributos(String referencia, String nombre, double precio){
        
    }
    public void calculo_venta(String referencia){
        
    }
}
