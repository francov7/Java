package fundamentos;
import java.util.Scanner;

public class Clase20Matrices {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int i, j;
        int matriz[][] = new int [3][3];

        /*matriz[0][0] = 5;
        matriz[0][1] = 13;
        matriz[0][2] = 96;
        matriz[1][0] = 35;
        matriz[1][1] = 33;
        matriz[1][2] = 71;
        matriz[2][0] = 446;
        matriz[2][1] = 228;
        matriz[2][2] = 24;*/

        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.println("Ingrese valor de la posicion i: " + i +" j:  "+j);
                matriz[i][j] = teclado.nextInt();
            }
        }

        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.println("El valor de la posicion i: " + i +" j:  "+j);
                System.out.println("es de: " + matriz[i][j]);
            }
        }
    }
}
