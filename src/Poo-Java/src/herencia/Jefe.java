package herencia;

public class Jefe extends Persona {
    int id_jefe;
    String departamento_jefe;

    public Jefe(){

    }
    public Jefe(int id_jefe, String departamento_jefe) {
        this.id_jefe = id_jefe;
        this.departamento_jefe = departamento_jefe;
    }

}
