package logica;

public class EjercicioIntegrador {

    public static void main(String[] args) {

        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasur bulba = new Bulbasur();
        Pikachu pika = new Pikachu();

        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();

        charmander.atacarAraniazo();
        charmander.atacarLanzallamas();

        bulba.atacarDrenaje();
        bulba.atacarDrenaje();

        pika.atacarAraniazo();
        pika.atacarImpactrueno();


    }
}
