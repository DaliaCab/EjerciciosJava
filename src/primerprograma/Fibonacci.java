package primerprograma;
import java.util.Scanner;
public class Fibonacci {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a = 0, b = 1, c;         //Declaramos variables
        
        System.out.println("Ingrese hasta qué número quiere calcular la secuencia de Fibonacci: " );
        int n =  leer.nextInt();     //Leemos lo que nos da el usuario

        
        int vector [] = new int[n];  //Vector de n posiciones
                
        for(int i = 0; i < n; i++){  //Usamos n como límite
            System.out.println("Estoy en el índice: " + i);
            c = a + b;             //En la primera iteración a=0 b=1 entonces c=1
            a = b;                 //a=1
            b = c;                 //c es la suma de a+b
            vector[i] = c;
            System.out.println("El resultado de la primera operación es: " + c);
        }
        
        
    }
    
}
 