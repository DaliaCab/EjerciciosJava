/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprograma;
import java.util.Scanner;

public class errores {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingresa tu edad");
    String nombre = leer.nextLine();

    System.out.println("Ingresa tu nombre");
    int edad = leer.nextInt();
    
    System.out.print("Tu nombre es " + nombre);
    System.out.print("Y tienes " + edad + " años");
    
    
    


    }   
}
