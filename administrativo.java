import java.util.*;

public class administrativo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> citas = new ArrayList<>();
        boolean salir = false;

        while (!salir) {
            System.out.println("=== EPS - Panel Administrativo ===");
            System.out.println("1. Ver citas agendadas");
            System.out.println("2. Agregar nueva cita");
            System.out.println("3. Cancelar cita");
            System.out.println("4. Confirmar cita");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (citas.isEmpty()) System.out.println("No hay citas registradas.");
                    else {
                        System.out.println("\n=== Citas registradas ===");
                        for (int i = 0; i < citas.size(); i++) {
                            System.out.println((i + 1) + ". " + citas.get(i));
                        }
                    }
                    break;
                case 2:
                    System.out.print("Fecha (dd/mm/aaaa): ");
                    String fecha = sc.nextLine();
                    System.out.print("Hora: ");
                    String hora = sc.nextLine();
                    System.out.print("Tipo de cita: ");
                    String tipo = sc.nextLine();
                    System.out.print("Nombre del paciente: ");
                    String nombre = sc.nextLine();
                    System.out.print("Identificación: ");
                    String id = sc.nextLine();
                    System.out.print("Teléfono: ");
                    String tel = sc.nextLine();
                    System.out.print("Doctor asignado: ");
                    String doctor = sc.nextLine();
                    String nuevaCita = fecha + " | " + hora + " | " + tipo + " | Paciente: " + nombre + " | ID: " + id + " | Doctor: " + doctor;
                    citas.add(nuevaCita);
                    System.out.println("\nCita registrada correctamente.\n");
                    break;
                case 3:
                    if (citas.isEmpty()) System.out.println("No hay citas para cancelar.");
                    else {
                        System.out.println("\n=== Citas disponibles ===");
                        for (int i = 0; i < citas.size(); i++) System.out.println((i + 1) + ". " + citas.get(i));
                        System.out.print("Seleccione el número de la cita a cancelar: ");
                        int cancelar = sc.nextInt();
                        sc.nextLine();
                        if (cancelar > 0 && cancelar <= citas.size()) {
                            System.out.println("¿Confirmar cancelación? (s/n): ");
                            String confirm = sc.nextLine();
                            if (confirm.equalsIgnoreCase("s")) {
                                citas.remove(cancelar - 1);
                                System.out.println("Cita cancelada correctamente.");
                            } else System.out.println("Cancelación anulada.");
                        } else System.out.println("Número inválido.");
                    }
                    break;
                case 4:
                    if (citas.isEmpty()) System.out.println("No hay citas para confirmar.");
                    else {
                        System.out.println("\n=== Citas pendientes ===");
                        for (int i = 0; i < citas.size(); i++) System.out.println((i + 1) + ". " + citas.get(i));
                        System.out.print("Seleccione el número de la cita a confirmar: ");
                        int conf = sc.nextInt();
                        sc.nextLine();
                        if (conf > 0 && conf <= citas.size()) {
                            System.out.println("Cita confirmada: " + citas.get(conf - 1));
                        } else System.out.println("Número inválido.");
                    }
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo del sistema administrativo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println();
        }
        sc.close();
    }
}
