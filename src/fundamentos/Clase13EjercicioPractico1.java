package fundamentos;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class Clase13EjercicioPractico1 {
    public static void main(String[] args) {

    /*Realizar un programa que dado porteclado un limite numerico por ejemplo 100 muestre en pantalla todos los numeros
    hasta ese limite (empezando por 1)*/

     int limite;
     int i;

     System.out.println("Ingrese un limite: ");
     Scanner teclado = new Scanner(System.in);
     limite = teclado.nextInt();

     System.out.println("======MOSTRANDO CON FOR======");
     for (i = 1; i<=limite; i++){
         System.out.println(i);
     }

     i = 1;

     System.out.println("======MOSTRANDO CON WHILE======");
     while(i<=limite){
         System.out.println(i);
         i++;
     }

    }
}
