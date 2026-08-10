package fundamentos;

import java.util.Scanner;

public class Clase22EjercicioPractico2 {
    public static void main(String[] args) {

        /* En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundaria.
           Cada fila corresponde a las notas y al promedio de cada alumno.
           Se necesita un programa que permita a un profesor cargar, en las 3 posiciones (columnas) de cada fila,
           las notas del alumno y que en la última columna se calculen los promedios. Una vez realizados los cálculos,
           se desea mostrar las 3 notas de cada alumno y el promedio correspondiente recorriendo la matriz.
         */

        int i, j;
        Scanner teclado = new Scanner(System.in);

        double M[][] = new double[4][4];
        double suma = 0.0;

        System.out.println("===CARGA DE LA MATRIZ===");

        for (i = 0; i < 4; i++) {

            System.out.println("\nAlumno nro " + (i + 1));

            for (j = 0; j < 3; j++) {

                System.out.print("Ingrese la nota " + (j + 1) + ": ");
                M[i][j] = teclado.nextDouble();
                suma = suma + M[i][j];

            }
            M[i][3] = suma / 3;
            suma = 0.0;
        }

        System.out.println("\n===MOSTRAR PROMEDIO===");

        for (i = 0; i < 4; i++) {
            System.out.println("\nAlumno nro " + (i + 1));
            for (j = 0; j < 3; j++) {

                System.out.println("Nota n° " + (j + 1) + ": " + M[i][j]);

            }
            System.out.println("El promedio de las notas es: " + M[i][3]);
        }

    }
}