package fundamentos;

import java.util.Scanner;

public class Clase23EjercicioPractico3 {
    public static void main(String[] args) {

        /*Llevar a cabo un programa que incluya un vector que almacene los nombres:
        Alejandra, Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa y Ludmila.
        Realizar un recorrido del vector para cargar los datos y
        otro recorrido para mostrar los mismos por pantalla.*/

        String v [] = new String [8];
        int i;

        Scanner teclado = new Scanner (System.in);

        for(i=0; i<v.length; i++){
            System.out.print("Ingrese nombre: ");
            v[i] = teclado.next();

        }
        System.out.println("===CONTENIDO DEL VECTOR===");
        for(i=0; i<v.length; i++){
            System.out.println(v[i]);
        }

    }
}
