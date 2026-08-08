package fundamentos;
import java.util.Scanner;

public class Clase21EjercicioPractico1 {
    public static void main(String[] args) {

        /*Realizar un programa que permita cargar 15 números en un vector.
        Una vez cargados, se necesita que el programa cuente e informe por pantalla
        cuántas veces se cargó el número 3
         */

        Scanner teclado = new Scanner (System.in);
        int i;
        int v[] = new int [15];
        int contador = 0;

        System.out.println("==========CARGANDO VECTOR==========");

        for(i=0; i<v.length; i++) {
            System.out.println("Ingrese valor para la posicion: " +i);
            v[i] = teclado.nextInt();
        }

        System.out.println("==========CONTANDO EL 3==========");

        for(i=0; i<v.length; i++){
            if(v[i] == 3){
                contador++;
            }
        }
        System.out.println("Se encontró el numero 3, "+ contador +" veces");
    }
}
