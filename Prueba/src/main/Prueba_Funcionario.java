
package main;

import java.util.Scanner;
import models.Funcionario;
public class Prueba_Funcionario {

    
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        Funcionario funcionario1;
        System.out.println("ingrese rut funcionario");
        String rut1= entrada.nextLine();
        System.out.println("ingrese nombre funcionario");
        String nombre1= entrada.nextLine();
        System.out.println("ingrese apellido funcionario");
        String apellido1= entrada.nextLine();
        System.out.println("ingrese domicilio funcionario");
        String domicilio1= entrada.nextLine();
        System.out.println("ingrese fecha nacimiento");
        String nacimiento1=entrada.nextLine();
        System.out.println("ingrese sueldo funcionario");
        double sueldo1= entrada.nextDouble();
        funcionario1= new Funcionario(rut1,nombre1,apellido1,domicilio1,nacimiento1,sueldo1);
        
        System.out.println(funcionario1.getAtributos());
    }
    
}
