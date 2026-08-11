package fundamentos;

public class Clase25EjercicioPractico5 {
    public static void main(String[] args) {

        /*Llevar a cabo un programa que permite cargar completamente con números 5
        una matriz de 4x5 (4 filas, 5 columnas).*/

        int M[][] = new int [4][5];
        int f,c;

        for(f=0; f<4; f++){
            for(c=0; c<5; c++){
                M[f][c] = 5;
            }
        }
        for(f=0; f<4; f++){
            System.out.println("");
            for(c=0; c<5; c++){
                System.out.print(M[f][c] +"\t");
            }
        }
    }
}
