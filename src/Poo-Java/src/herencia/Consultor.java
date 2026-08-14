package herencia;

public class Consultor extends Persona{

    String nombre_consultar;
    int num_consultor;

    public Consultor(){

    }
    public Consultor(int id, String dni, String apellido, String nombre, String domicilio, String telefono, String nombre_consultar, int num_consultor) {
        super(id, dni, apellido, nombre, domicilio, telefono);
        this.nombre_consultar = nombre_consultar;
        this.num_consultor = num_consultor;
    }

    public String getNombre_consultar() {
        return nombre_consultar;
    }

    public void setNombre_consultar(String nombre_consultar) {
        this.nombre_consultar = nombre_consultar;
    }

    public int getNum_consultor() {
        return num_consultor;
    }

    public void setNum_consultor(int num_consultor) {
        this.num_consultor = num_consultor;
    }
}
