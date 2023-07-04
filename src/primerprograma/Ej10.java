package primerprograma;
import java.util.Scanner;
public class Ej10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número hasta llegar al número secreto: " );
        
        int sumatoria = 0;
        int respuesta = leer.nextInt();   
        
        while(respuesta < 101 ){
            
            sumatoria = respuesta + sumatoria;
       
            System.out.println("Vas en el número: " + sumatoria + "Ingresa otro número ");
            respuesta = leer.nextInt();  
        }
        System.out.println("Llegaste al número secreto :O" );  
    }
    
}
