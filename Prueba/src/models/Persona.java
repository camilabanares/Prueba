
package models;

public class Persona {
    private String rut;
    private String nombre;
    private String apellido;
    private String domicilio;

    public Persona(String rut, String nombre, String apellido) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String rut, String nombre, String apellido, String domicilio) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
    }
    
    
    
}
