package herencia;

public class Herencia {
    public static void main(String[] args) {

        Empleado emple = new Empleado();

        emple.getNum_legajo();
        emple.getNombre();

        Consultor consul = new Consultor();
        consul.getNombre_consultar();
    }
}
