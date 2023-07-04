/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprograma;
import java.util.Scanner;

public class primerJava {
    public static void main(String[] args) {
        //variable scanner para leer datos del usuario
        Scanner leer = new Scanner(System.in); //Siempre cerrar con ;
        //variable String para leer datos del usuario
        String nombre;
        //Variable System.out.println muestra un msj por pantalla
        System.out.println("Ingresa tu nombre:");
        //variable para leer leer.next
        nombre = leer.next();
        //Ahora mostramos por consola lo hecho
        System.out.println("Hola mundo, soy " + nombre + " y estoy programando en Java!");
    }
}
