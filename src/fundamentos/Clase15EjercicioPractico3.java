package fundamentos;
import java.util.Scanner;

public class Clase15EjercicioPractico3 {
    public static void main(String[] args) {

        /*Realizar un programa que muestre por pantalla palabras que sean ingresadas
        por teclado hasta que se ingrese la palabra "salir"
         */

        String palabra;

        System.out.println("Ingrese una palabra: ");
        Scanner teclado = new Scanner(System.in);
        palabra = teclado.next();

        //equals sirve para comparar strings
        //equalsIgnoreCase sirve para ignorar mayusculas/minusculas
        while(!palabra.equalsIgnoreCase("salir")){

            System.out.println("La palabra es: "+palabra);

            System.out.println("Ingrese una palabra: ");
            palabra = teclado.next();
        }

    }
}
