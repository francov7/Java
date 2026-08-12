package fundamentos;

import java.util.Scanner;

public class Clase26EjercicioPractico6 {
    public static void main(String[] args) {

        /*Una compañía de vuelos cuenta con 6 destinos a los que realiza 3 vuelos diariamente,
        uno por la mañana, otro al mediodía y otro por la noche.
        Para administrar estos datos, utiliza una matriz, donde cada fila es un destino y
        en cada columna se guarda la cantidad de asientos disponibles.

        i. Se necesita un programa que permita la carga de la matriz con la cantidad de asientos para cada vuelo.

    -------------------------------------------------------------------------------------------------------------------

    ii. Al mismo tiempo, el programa debe permitir a un usuario ingresar el número de destino al que quiere dirigirse,
    el número de vuelo (dependiendo si quiere viajar a la mañana, al mediodía o a la noche) y la cantidad de pasajes que necesita.

    -------------------------------------------------------------------------------------------------------------------------------

    iii. A partir de la solicitud del usuario, el programa debe controlar si hay la cantidad suficiente de asientos para la cantidad
    de pasajes que se requiere. En caso de que así sea, se debe mostrar un cartel por pantalla que diga “su reserva fue realizada con éxito” y
    se debe descontar del total de asientos los solicitados por el usuario. En caso de no haber más asientos disponibles, se debe informar otro cartel que diga “disculpe,
    no se pudo completar su operación dado que no hay asientos disponibles”.

    ----------------------------------------------------------------------------------------------------------------------------------------------------------------------

    Desde la compañía de vuelos manifiestan que NO CONOCEN cuantas ventas/reservas se hacen por día. Por lo cual, para finalizar las ventas se ingresa la palabra “finish”.
         */

        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);

        int M[][] = new int [6][3];
        int f, c;
        int numDestino;
        int numHorario;
        int cantAsientos;
        String bandera = "";

        /*1 CARGA MATRIZ*/
        for(f = 0; f < 6; f++) {
            System.out.println("=== DESTINO " + (f + 1) + " ===");
            for(c = 0; c < 3; c++) {
                System.out.print("Ingrese cantidad de asientos disponibles para el turno " + (c + 1) + ": ");
                M[f][c] = teclado.nextInt();
            }
        }

        /*2 RESERVAS Y VENTAS*/
        while(!bandera.equalsIgnoreCase("finish")) {

            System.out.print("\nIngrese numero de destino (del 1 al 6): ");
            numDestino = teclado.nextInt();

            System.out.print("Ingrese horario (1 mañana, 2 mediodia, 3 noche): ");
            numHorario = teclado.nextInt();

            System.out.print("Ingrese cant de asientos que desea: ");
            cantAsientos = teclado.nextInt();

            /*3 CONTROL ASIENTOS*/
            if(M[numDestino - 1][numHorario - 1] < cantAsientos) {
                System.out.print("Disculpe, no se pudo completar su operación dado que no hay asientos disponibles\n");
            }
            else {
                M[numDestino - 1][numHorario - 1] = M[numDestino - 1][numHorario - 1] - cantAsientos;
                System.out.print("Su reserva fue realizada con éxito\n");
            }

            System.out.println("¿Desea continuar reservando? Ingrese 'finish' para terminar, o cualquier otra palabra para seguir:");
            bandera = teclado2.next();

        }

    }
}
