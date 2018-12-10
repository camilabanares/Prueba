/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author 1-
 */
public class ejercicioUnoMetodos {
    private int cuenta;
    private String nombre;
    private int saldo;
    private int interes;
    private int deposito;
    private int giro;
    private int convertir;
    
    public ejercicioUnoMetodos(){
        
    }

    public ejercicioUnoMetodos(int cuenta, String nombre, int saldo, int interes, int deposito, int giro, int convertir) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.saldo = saldo;
        this.interes = interes;
        this.deposito = deposito;
        this.giro = giro;
        this.convertir= convertir;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    public int getGiro() {
        return giro;
    }

    public void setGiro(int giro) {
        this.giro = giro;
    }
    public int getConvertir() {
        return convertir;
    }

    public void setConvertir(int convertir) {
        this.convertir= convertir;
    }
    public String getEstado(){
        return "La cuenta "+this.cuenta+" a nombre de "+this.nombre+" con saldo actual de "
                +(this.saldo+this.deposito-this.giro)+" con un interes ganado de "+(this.saldo*(this.interes/100));
        
    }
    public String getConversion(){
        return this.convertir+" pesos chilenos equivalen a "+(this.convertir/500)+" USD";
    }
    
}
