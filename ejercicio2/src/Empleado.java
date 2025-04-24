public class Empleado {
    //Atributos
    public String nombre;
    public String cargo;
    public Double salario;
    public String fechaIngreso;

    //Constructor

    Empleado(String nombre, String cargo, Double salario, String fechaIngreso) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
    }

    //Método

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre+" cargo: "+cargo+" salario: "+salario);
    }


}
