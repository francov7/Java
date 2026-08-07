package fundamentos;
import java.util.Scanner;

public class Clase16EjercicioPractico4 {
    public static void main(String[] args) {

        /*En la ciudad de obera misiones, se realiza cada año la maraton del inmigrante, en el marco de la fiesta nacional del inmigrante.
        el evento cuenta con un dia de inscripciones el dia anterior a la carrera, por lo que se desconoce la cantidad exacta de inscripciones que puede llegar a haber.
        desde la federacion de colectividades (organismo que organiza) manifestaron que se solicitan los siguientes datos: dni, edad, nombre,
        en cuanto a las categorias posibles para una inscripcion, se manejan las siguientes:
        menores a (de 6 a 10 años)
        menores b (de 11 a 17 años)
        juveniles (de 18 a 30)
        adultos (de 31 a 50)
        adultos mayores (mayores a 50)

        se necesita un programa que a partir del ingreso de los datos y la edad de cada participante se muestre por pantalla a que categoria debe ser inscripto
        cabe destacar que al finalizar el dia, para dar fin a las inscripciones, se debe ingresar un dni con valor 0 y un nombre con la palabra "fin".
         */

        String nombre;
        int edad;
        int dni;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese dni: ");
        dni = teclado.nextInt();

        System.out.println("Ingrese nombre: ");
        nombre = teclado.next();

        while(dni!=0 && !nombre.equalsIgnoreCase("fin")){

            System.out.println("Ingrese edad: ");
            edad = teclado.nextInt();

            if(edad>=6 && edad<=10){
                System.out.println("Debe ser inscripto en: MENORES A");
            } else if(edad>=11 && edad<=17){
                System.out.println("Debe ser inscripto en: MENORES B");
            } else if(edad>=18 && edad<=30){
                System.out.println("Debe ser inscripto en: JUVENILES");
            } else if(edad>=31 && edad<=50){
                System.out.println("Debe ser inscripto en: ADULTOS");
            } else if (edad>50){
                System.out.println("Debe ser inscripto en: ADULTOS MAYORES");
            } else
                System.out.println("No cumple con la edad para niguna categoria");

            System.out.println("Ingrese dni: ");
            dni = teclado.nextInt();

            System.out.println("Ingrese nombre: ");
            nombre = teclado.next();

        }
        System.out.println("Inscripciones finalizadas.");

    }
}
