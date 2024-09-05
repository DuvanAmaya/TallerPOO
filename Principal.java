import java.util.Date;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su apellido:");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese su cédula:");
        String cedula = scanner.nextLine();

        System.out.println("Ingrese su email:");
        String email = scanner.nextLine();

        System.out.println("Ingrese su género:");
        String genero = scanner.nextLine();

        Usuario usuario = new Usuario(nombre, apellido, cedula, email, genero);
        
        String respuesta;
        do {
            System.out.println("Ingrese el peso (kg):");
            double peso = scanner.nextDouble();

            System.out.println("Ingrese la altura (m):");
            double altura = scanner.nextDouble();

            IMC imc = new IMC(peso, altura, usuario);
            usuario.agregarIMC(imc);
            usuario.mostrarIMC();

            System.out.println("Desea calcular otro IMC? (si/no)");
            scanner.nextLine();
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));


        scanner.close();
    }
}
