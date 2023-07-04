/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package primerprograma;
import java.util.Scanner;
public class Ej12 {
   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int contarC = 0;
        int contarI = -1; //Siempre entra 1 vez de más por culpa del cierre
        String respuesta = "";
        
        // Para comparar Strings siempre se debe usar .equals, no se pueden usar igual == ni diferente !=
        while(!respuesta.equals("&&&&&")){ // ! -> NOT, se pone para negar un valor booleano
            System.out.println("Ingrese una cadena de 5 caracteres: " );
            respuesta = leer.next();
            
            // Tambien se pede usar .equalsIgnoreCase si mayus/minus no importa&
            if (respuesta.length() == 5 && respuesta.substring(0,1).equalsIgnoreCase("x") && respuesta.substring(4,5).equalsIgnoreCase("o")){
                // System.out.println("CORRECTO" );
                contarC++;
            }
            else {
                // System.out.println("INCORRECTO" );
                contarI++;
            }
        }
        System.out.println("El número de cadenas incorrectas fue: " + contarI ); 
        System.out.println("El número de cadenas correctas fue: " + contarC ); 
    }
}
