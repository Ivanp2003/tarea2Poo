public class Jugador {
    //Atributos

    public String nombre;
    public int edad;
    public String posicion;

    //Constructor

    public Jugador(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    //Método

    public void mostrarInformación(){
        System.out.println("-----Informacion del Jugador-----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Posicion: " + posicion);
        System.out.println("---------------------------------\n");
    }

}
