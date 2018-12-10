
package models;


public class Funcionario {
    private String rut;
    private String nombre;
    private String apellido;
    private String domicilio;
    private String nacimiento;
    private double sueldo;

    public Funcionario(){
        
    }
    public Funcionario(String rut, String nombre, String apellido, String domicilio, String nacimiento, double sueldo) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.nacimiento = nacimiento;
        this.sueldo = sueldo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public String getAtributos(){
        return this.rut+", "+this.nombre+" "+this.apellido+", "+this.nacimiento+", "+this.sueldo;
    }
    
}
