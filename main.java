import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] horas = {"12:00", "11:00", "10:00", "9:00"};
        String[] tipos = {"Cita pediátrica", "Medicina general", "Medicina general", "Medicina general"};

        System.out.println("=== EPS Steam - Área Médica ===");
        System.out.println("Citas disponibles:");
        for (int i = 0; i < horas.length; i++) {
            System.out.println((i + 1) + ". " + horas[i] + " - " + tipos[i]);
        }

        System.out.print("Seleccione el número de la cita que desea atender: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        if (opcion < 1 || opcion > horas.length) {
            System.out.println("Opción inválida.");
            return;
        }

        System.out.println("\n--- Datos del paciente ---");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Identificación: ");
        String id = sc.nextLine();
        System.out.print("Dirección: ");
        String direccion = sc.nextLine();
        System.out.print("Plan médico: ");
        String plan = sc.nextLine();
        System.out.print("Motivo de cita: ");
        String motivo = sc.nextLine();

        System.out.println("\n--- Resumen de cita ---");
        System.out.println("Hora: " + horas[opcion - 1]);
        System.out.println("Tipo: " + tipos[opcion - 1]);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Identificación: " + id);
        System.out.println("Dirección: " + direccion);
        System.out.println("Plan médico: " + plan);
        System.out.println("Motivo: " + motivo);
        System.out.println("\nCita registrada correctamente.");

        sc.close();
    }
}