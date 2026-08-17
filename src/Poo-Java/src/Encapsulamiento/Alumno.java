package Encapsulamiento;

public class Alumno {
    //public se accede desde cualquier clase y posicion
    //pivate unicamente se usa dentro de la clase donde fue declarado
    //protected son accesibles SOLO dentro de la misma clase, en clases hijas y dentro del mismo paquete.
    int id;
    private String nombre;
    private String apellido;

    public Alumno (){
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

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
}
