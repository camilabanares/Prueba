
package main;

import java.util.Scanner;
import models.ejercicioUnoMetodos;

public class EjercicicioUno {

    public static void main(String[] args) {
        ejercicioUnoMetodos cuenta1;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese numero de cuenta");
        int cuenta= entrada.nextInt();
        entrada.skip("\n");
        System.out.println("Ingrese Nombre del titular de cuenta");
        String nombre= entrada.nextLine();
        System.out.println("Ingrese Saldo de cuenta");
        int saldo= entrada.nextInt();
        entrada.skip("\n");
        System.out.println("Ingresar interes anual de la cuenta:");
        int interes= entrada.nextInt();
        entrada.skip("\n");
        System.out.println("Ingrese deposito:");
        int deposito= entrada.nextInt();
        entrada.skip("\n");
        System.out.println("Ingrese giro:");
        int giro= entrada.nextInt();
        entrada.skip("\n");
        System.out.println("ingrese monto a convertir de CLP a USD:");
        int convertir= entrada.nextInt();
        entrada.skip("\n");
        cuenta1= ejercicioUnoMetodos(cuenta,nombre,saldo,interes,deposito,giro,convertir);
        System.out.println(cuenta1.getEstado());
        System.out.println(cuenta1.getConversion());
        
    }
    
}
