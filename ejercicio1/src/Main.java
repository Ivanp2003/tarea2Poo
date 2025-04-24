//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*
* Desarrollar una clase en Java llamada Jugador que tenga los atributos y un método
para mostrar la información del jugador. Luego, crear tres objetos de esta clase, cada uno
representando un jugador diferente.
Realizar EL REGISTRO de los atributos con datos quemados y utilizando Scanner combinar
* */

        //Crear instancia

        Jugador jugador = new Jugador("Andres Panchi", 21, "Volante");
        Jugador jugador1 = new Jugador("Ivan Chavez", 22, "Delantero");
        Jugador jugador2 = new Jugador("Juan", 23, "Arquero");
        Jugador jugador3 = new Jugador("Messi", 30, "Delantero");
        Jugador jugador4 = new Jugador("Sergio", 31, "Defensa");

        //Llama al método

        jugador.mostrarInformación();
        jugador1.mostrarInformación();
        jugador2.mostrarInformación();
        jugador3.mostrarInformación();
        jugador4.mostrarInformación();
    }
}