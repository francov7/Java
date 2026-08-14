package logica;

public class POO {
    public static void main(String[] args) {

        Alumno alu1 = new Alumno(); /*invoca al constructor sin parametros*/
        Alumno alu2 = new Alumno(1, "Franco", "Velazquez");/*invoca al constructor parametrizado*/

        /*mostramos mediante .get*/
        System.out.println("La id del alumno 2 es: "+ alu2.getId());
        System.out.println("El nombre es: "+ alu2.getNombre());
        System.out.println("El apellido es: "+ alu2.getApellido());

        /*seteamos los datos*/
        alu1.setId(8);
        alu1.setNombre("Ezequiel");
        alu1.setApellido("Velazquez");

        System.out.println("==========================");
        System.out.println("La id del alumno 1 es: "+ alu1.getId());
        System.out.println("El nombre es: "+ alu1.getNombre());
        System.out.println("El apellido es: "+ alu1.getApellido());
        System.out.println("==========================");

        /*CAMBIO DE VALOR CON EL SET*/
        alu2.setId(7);
        System.out.println("La nueva id de alumno 2 es: "+ alu2.getId());
    }
}
