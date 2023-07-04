package primerprograma;
import java.util.Scanner;
public class vectorYMatriz {

    public static void main(String[] args) {
        int []  vector;
        vector = new int[2];          //Damos dimensión al vector, por defecto tiene valor de 0
        int[] producto =  new int[3]; 
        int[][] matriz = {{4,8,6}, {2,1,7}}; //{Fila 1} {fila 2} 
                
                
        System.out.println("Ingrese los valores del vector de tamaño " + vector.length + ": " );
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i <vector.length; i++){
            System.out.print("v["+i+"]=");  //Accede al valor i del vector
            vector[i] = leer.nextInt();     //Ususario asigna valor al vector vector:nombre de la variable [i]:elemento al que queremos accceder
        }
        //Ahora multipliquemos vector por matriz
        int sum;
        //Int = 0 porque arreglos en Java inician desde 
        //.lenght nos devuelve la cardinalidad de las dimensiones del arreglo
        for (int j=0; j<matriz[0].length; j++){
            sum=0;
            for (int i=0; i<vector.length; i++){
                sum += vector[i] * matriz[i][j];
            }
            producto[j] = sum;
      
        }
        
        String aux = "";
        
        //Ahora mostremos el vector
        System.out.println("* Vector:");
        for (int elemento: vector){
            aux = aux + " " + elemento;
        }
         System.out.println("\n* Matriz:"); //para cada fila de la matriz 
         for (int[] fila : matriz) {
             aux = "";                    //para cada elemento de la fila
             for(int elemento: fila){
                 aux += "   " + elemento; 
                 //Con el operador += concatenamos sumando el valor 
                 //que estamos concatenando con la expresión que tenemos a la derecha
                 //Es como la línea 34 omitiendo poner aux dos veces
             }
             System.out.println(aux);
         }
         //Mostremos el resultado
         aux = "";
         System.out.println("\n* Vector x Matriz:");
         for (int elemento: producto){
             aux += "  " + elemento;
         }
         System.out.println(aux);
    }    

    
}
