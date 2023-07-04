
package primerprograma;
import java.util.Scanner;

public class Bucle {

    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        do {                                 //Do while es el Hacer mientras
            System.out.println("Ingrese un número entero posistivo");
            num = leer.nextInt();
            if (num > 1000){
                System.out.println("Este programa podría tardar, está seguro? (s/n)");
                String confirma = leer.next();
                if (confirma.equals("s")){ //usamos función equals para saber si dos objetos son del mismo tipo y tienen los mismos datos  
                    break;                 //Nos da true si son iguales o false si son diferentes
                                           //Si confirma = s entonces break(es una sentencia de salto al prox bloque)
                }
            }
        } while (num <= 0 || num > 1000 );
        
        /*Para usar el ciclo for debemos :
        for(inicialización_variable; expresion_determinacion ; paso/incremento/decremento){
        sentencias
        }
        Si la extresion determinacion es es falsa se termina el bucle
        como paso 3 indicamos el paso de la variable de control
        */
        
        
        int j, suma;                     //Iniciando desde i valor 1 mientras que el valor de i sea <= a num, varía el valor de i de uno en uno
        for(int i=1 ; i<=num ; i++){     //Bucle for análogo al bucle Para
            if(i%2 != 0)                //i++ es como un contador como decir i=i+1 entonces es desde el número que ingresa el usuario y con paso de 1 en 1
                continue;               //Si el módulo es diferete a 0 (valor impar)continue con el siguiente valor 
                                        //Continue: detenemos la iteración actual
            suma = 0;                   
            j = 1;
            while(j<=i){
                suma += j;
                j++;
            }
            System.out.println("La suma de los "+ i +" numeros es: "+ suma);
        }
    }
    
}
