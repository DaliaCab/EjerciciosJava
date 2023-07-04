package primerprograma;
import java.util.Scanner;
public class whilee {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String respuesta;
        do {
            System.out.println("¿Desea continuar?");
            respuesta = leer.nextLine();
        }while (respuesta.equalsIgnoreCase("SI"));
    }
    
}
