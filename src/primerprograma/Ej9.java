/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
 */
package primerprograma;
import java.util.Scanner;
public class Ej9 {

    public static void main(String[] args) {
        String respuesta;
        String letra;

        System.out.println("Ingrese una palabra o frase que inicie en A: " );
        Scanner leer = new Scanner(System.in);
        
        respuesta = leer.next();            //Leo lo que me da el usuario
        letra = respuesta.substring(0,1);   //Aquí saqué la primera letra del string
        
        if (letra.equalsIgnoreCase("A")) {  //Para poder compararla aquí con a ó A
            System.out.println("CORRECTO" );
        }
        else {
          System.out.println("INCORRECTO" );  
        } 
            
        
        }
    }