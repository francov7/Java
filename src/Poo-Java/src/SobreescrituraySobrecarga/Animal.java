/*SOBRECARGA*/
/*DENTO DE UNA CLASE PODEMOS TENER 2 METODOS CON EL MISMO NOMBER,PERO CON DISTINTOS PARAMETROS*/

/*SOBREESCRITURA*/
/* Una clase hija Modifica o reemplaza un método que ya heredó de su clase padre, dándole una nueva función propia*/

package SobreescrituraySobrecarga;
public class Animal {
    private int id_animal;
    private String descripcion;
    //constructores
    //getters y setters
    // otros metodos

    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
    public void hacerSonido(String nombreAnimal){
        System.out.println("El animal "+nombreAnimal+" hace un sonido");
    }
    public void hacerSonido(String nombreAnimal, String tipoSonido){
        System.out.println("El animal "+nombreAnimal+" hace un sonido de tipo "+tipoSonido);
    }

}
