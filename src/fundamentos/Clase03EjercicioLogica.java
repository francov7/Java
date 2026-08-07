package fundamentos;

public class Clase03EjercicioLogica {
    public static void main(String[] args) {

        /*Realizar un programa que permita el intercambio de valores entre dos variables.
        Por ejemplo: si una variable numero vale 35, y una variable numero2 vale 20, realizar
        las acciones necesarias para que numero pase a valer 20 y numero2 pase a valer 35. Una vez
        realizado el intercambio mostrar el resultado por pantalla
         */

        //inicio
        int numero1 = 35;
        int numero2 = 20;
        int aux; //variable auxiliar

        System.out.println("===Inicio===");
        System.out.println("Valor de numero1: " + numero1);
        System.out.println("Valor de numero2: " + numero2);

        //acá hago el intercambio
        aux = numero1;
        numero1 = numero2;
        numero2 = aux;

        //muestro por pantalla
        System.out.println("===Luego del intercambio===");
        System.out.println("Valor de numero1: " + numero1);
        System.out.println("Valor de numero 2: " + numero2);


    }
}
