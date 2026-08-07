package fundamentos;
import java.util.Scanner;
public class Clase08EjercicioIntegrador {
    public static void main(String[] args) {

        /* Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos de los mismos pueden tener 3 categorías:
        1- repositor, 2- cajero y 3- supervisor.
        Los repositores cobran $15.890 + un bono del 10%
        Los cajeros cobran $25.630,89 fijos
        Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 11% de jubilación.
        Se necesita un programa que, dependiendo del tipo de empleado del que se trate, calcule y muestre en pantalla el correspondiente sueldo.*/

     int categoria;
     double sueldo;
     String empleado;

     System.out.println("Ingrese el tipo de categoria: ");
     Scanner teclado = new Scanner (System.in);
     categoria = teclado.nextInt();

     /*switch (categoria) {

         case 1 : empleado = "repositor";
             sueldo = 15890 + (15890*0.10);
             System.out.println("El sueldo de repositor es de: " + sueldo);
         break;

         case 2 : empleado = "cajero";
             sueldo = 25630.89;
             System.out.println("El sueldo de cajero es de: " + sueldo);
         break;

         case 3 : empleado = "supervisor";
             sueldo = 35560.20 - (35560.20*0.11);
             System.out.println("El sueldo de supervisor luego de aplicar el dto de jubilacion es de: " + sueldo);
         break;

         default: empleado = "Numero de empleado ingresado incorrecto";
         break;

     }
        System.out.println("Empleado seleccionado: " + empleado);
      */

     if (categoria == 1){
         sueldo = 15890 + (15890*0.10);
         System.out.println("El sueldo de repositor es de: " + sueldo);
     }
     else {
         if (categoria == 2) {
             sueldo = 25630.89;
             System.out.println("El sueldo de cajero es de: " + sueldo);
         }
         else
            if (categoria == 3){
                sueldo = 35560.20 - (35560.20*0.11);
                System.out.println("El sueldo de supervisor luego de aplicar el dto de jubilacion es de: " + sueldo);
            }
            else{
                System.out.println("Debe ingresar un numero de categoria valido");
            }
     }

    }
}
