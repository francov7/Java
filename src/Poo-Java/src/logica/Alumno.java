package logica;

/*CREACION DE UNA CLASE*/
public class Alumno {

    /*ATRIBUTOS DE LA CLASE*/
    /*Qué es, qué características tiene*/
    int id;
    String nombre;
    String apellido;

    /*METODOS CONSTRUCTORES*/
    /*NOS PERMITE CREAR OBJETOS DE TIPO ALUMNO*/
    /*CREAR UNA INSTANCIA*/

    public Alumno() {
    }
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    /*getters and setters*/
    /*con el get puedo ver los datos*/
    /*con el set setearlos si es la primera vez o modificarlos si ya tiene datos cargados*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /*METODOS*/
    /*Cosas que el objeto puede hacer*/
    /*Verbos en infinitivo: ar, er, ir*/

    public void mostrarNombre(){
        System.out.println("Hola, soy un alumno y se decir mi nombre");
    }





}
