package fundamentos;
import java.util.Scanner;

public class Clase18Vectores {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        int i;
        int vector [] = new int [4];

        /*vector[0]=2;
        vector[1]=35;
        vector[2]=48;
        vector[3]=157;*/

        System.out.println("======CARGA DEL VECTOR======");
        for(i=0; i<vector.length; i++){
            System.out.println("Ingrese valor para el indice: "+i);
            vector[i] = teclado.nextInt();
        }

        System.out.println("======CONTENIDO DEL VECTOR======");
        for(i=0; i<vector.length; i++){
            System.out.println("Estoy en el indice: " +i);
            System.out.println("Tengo guardado un " + vector[i]);
            System.out.println("---------------");
        }

    }
}
