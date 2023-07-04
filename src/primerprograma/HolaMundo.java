/*
 *Este programa escribe el texto "Hola mundo" en la consola, utilizando el método
 *System.out.println
*public class NombreGuiaEj01 {
*/
package primerprograma;

public class HolaMundo {
    
    public static void main (String[] args) {
        //La línea 12 muestra el mensaje por pantalla al ejecutar el programa
        System.out.println("Hola Mundo");
        
        for(int i=0; i<4;i++){
            for(int j=0; j<5; j++){
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    
    }
}
        