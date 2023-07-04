/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprograma;
import java.util.Scanner;

public class condicionales {
    public static void main(String[] args) {
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Clasifique la peli de 1 a 5 estrellas");
        opinion = leer.nextInt();
        
        if (opinion >= 1 && opinion <= 5){
            switch (opinion){
                case 1:
                case 2:
                    System.out.println("Nos sentimos apenados de que no hayas disfrutado la película");
                    break;
                case 3:
                    System.out.println("Has calificado la peli como buena");
                    break;
                case 4:
                    System.out.println("Has calificado la peli como muy buena");
                    break;
                case 5:
                    System.out.println("Te encantó la película :D ");
                    break;
            //El comando break nos sirve para que una vez se ejecuta el bloque de código
            //para el condicional con switch se detenga la ejecución y no continue.
            //El equivalente a Según en PseInt es Switcj en Java
            //El equivalente a De Otro modo en PseInt es Default en Java
            //Osea que si ninguna opción se cumple se ejecutan las acciones por defecto
                    
                    
            }
        }
        // TODO code application logic here
    }
    
}
