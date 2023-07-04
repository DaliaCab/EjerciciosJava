/*
Las matrices están guardadas en el archivo llamado input21.txt
 */
package primerprograma;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Ej21 {
    static int[][] matrizGrande = new int[10][10];
    static int[][] matrizPeque = new int[3][3];

    static void crear_matrices(){
        try {
            Scanner m = new Scanner(new File("C:\\Users\\xxi\\Documents\\NetBeansProjects\\nombreGuiaEj01\\src\\primerprograma\\input21.txt"));
            for(int i=0; i<10; i++){
                String[] nums = m.nextLine().split("\t");
                for(int j=0; j<10; j++){
                    matrizGrande[i][j] = Integer.parseInt(nums[j]);
                }
            }
            for(int i=0; i<3; i++){
                String[] nums = m.nextLine().split("\t");
                for(int j=0; j<3; j++){
                    matrizPeque[i][j] = Integer.parseInt(nums[j]);
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Ej21.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static void printMatriz(int[][] matriz){
        for(int[] m: matriz){
            for(int n: m){
                System.out.print("\t" + n);
            }
            System.out.println("");
        }
    }
    
    static int[] validarMatrices (int[][] matrizG, int[][] matrizP){
        int[] respuesta = new int[2];
        //Creamos un vector de dos espacios para guardar la posición i,j en que encuentra la matriz
        for (int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                
                for (int x = 0; x < 3; x++){
                    for(int y = 0; y < 3; y++){
                        
                        if (matrizG[i+x][j+y] != matrizP[x][y] ){
                            // break para los 2 for, el de x y el de y
                            x=3;
                            y=3;
                        } else if (x==2 && y==2){
                            respuesta[0] = i;     //Guardamos la posición i
                            respuesta[1] = j;     //Guardamos la posición j
                            return respuesta;
                        }
                    }
                }
            }
        }
        respuesta[0] = -1;   //Si no se encuentra la matriz ponemos un valor inválido
        respuesta[1] = -1;
        return respuesta;
    }
    
    public static void main(String[] args) {
        crear_matrices();
        printMatriz(matrizGrande);
        printMatriz(matrizPeque);
        
        int[] indicesValidados = validarMatrices(matrizGrande, matrizPeque);   //Se le asigna lo que la función retorna osea el vector respuesta
       
        if(indicesValidados[0] != -1){ // Aquí validamos si el indice es igual a un valor válido, 
            //recordemos que arriba poníamos un valor inválido si no se encontraba la matriz
            System.out.println("La matriz pequeña sí se encuentra dentro de la matriz grande");
            System.out.println("La matriz empieza en la posición " + indicesValidados[0] + ", " + indicesValidados[1]);
        } else{
            System.out.println("La matriz pequeña no está dentro de la matriz grande");
             
        }
    }
}
