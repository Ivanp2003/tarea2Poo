import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un arreglo para guardar los empleados
        Empleado[] empleados = new Empleado[3];

        // Solicitar datos por teclado para 3 empleados
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese los datos del empleado " + (i + 1) + ":");

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();

            System.out.print("Salario: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer

            System.out.print("Fecha de ingreso (ejemplo: 1 Enero 2024): ");
            String fechaIngreso = scanner.nextLine();

            empleados[i] = new Empleado(nombre, cargo, salario, fechaIngreso);
            System.out.println(); // Espacio entre empleados
        }

        // Mostrar la información de los empleados
        System.out.println("Información de los empleados:");
        for (Empleado empleado : empleados) {
            empleado.mostrarInformacion();
        }

        scanner.close();
    }
}
