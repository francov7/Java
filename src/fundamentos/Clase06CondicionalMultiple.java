package fundamentos;

public class Clase06CondicionalMultiple {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 10;

        if (num2 > num1) {
            System.out.println("El segundo es mayor.");
        } else {
            if (num2 == num1){
                System.out.println("Son iguales.");
            }
            else
                System.out.println("El primero es mayor.");
        }
    }
}
