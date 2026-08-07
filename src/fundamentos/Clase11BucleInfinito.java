package fundamentos;

public class Clase11BucleInfinito {
    public static void main(String[] args) {

        boolean centinela = true;

        while (centinela == true) {

            System.out.println("El valor del centinela es: " + centinela);
            centinela=false; //si no cambio el valor de centinela o en su defecto contador,
                            //se produce un bucle infinito

        }

    }
}
