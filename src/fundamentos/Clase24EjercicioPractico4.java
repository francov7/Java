package fundamentos;

import java.util.Scanner;

public class Clase24EjercicioPractico4 {
    public static void main(String[] args) {

       /*En tres vectores diferentes se guardan los nombres, temperaturas mínimas y máximas de 5 ciudades de la provincia de Misiones.
        En el primer vector se guardan los nombres de las ciudades,
        en el segundo las temperaturas mínimas alcanzadas
        y en el tercero las temperaturas máximas alcanzadas en la última semana.
        Se necesita un programa que permita la carga de las ciudades, sus temperaturas mínimas y máximas;
        además, deberá poder informar por pantalla cuál fue la ciudad con la temperatura más baja y
        cuál con la temperatura más alta (dando a conocer al mismo tiempo la cantidad de grados).*/

        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);

        String ciudades [] = new String [5];
        double minimas[] = new double [5];
        double maximas[] = new double [5];

        String ciudadMax;
        String ciudadMin;
        double tempMax;
        double tempMin;
        int posMin;

        int i;

        System.out.println("===CARGA DE CIUDADES===");
        for(i=0; i<ciudades.length; i++){

            System.out.print("Ingrese la ciudad nro "+ (i+1) + ": ");
            ciudades[i] = teclado.next();

            System.out.print("Ingrese temperatura minima: ");
            minimas[i] = teclado2.nextDouble();

            System.out.print("Ingrese temperatura maxima: ");
            maximas[i] = teclado2.nextDouble();
        }

        //buscar minimo
        tempMin = minimas[0];
        ciudadMin = ciudades[0];
        for(i=0; i<minimas.length; i++){

            if(minimas[i] < tempMin) {

                tempMin = minimas[i];
                ciudadMin = ciudades[i];
                posMin = i;
            }
        }
        System.out.println("Ciudad con la temperatura mas baja: "+ ciudadMin +", "+ tempMin);

        //buscar maxima
        tempMax = maximas[0];
        ciudadMax = ciudades[0];
        for(i=0; i<maximas.length; i++){
            if(maximas[i] > tempMax) {

                tempMax = maximas[i];
                ciudadMax = ciudades[i];
            }
        }
        System.out.println("Ciudad con la temperatura mas alta: "+ ciudadMax +", "+ tempMax);

    }
}
