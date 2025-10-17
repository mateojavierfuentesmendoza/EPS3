import java.util.*;

public class paciente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "", id = "", telefono = "", direccion = "", tipoCita = "", motivo = "";
        String[] horas = {"9:00", "10:00", "11:00", "12:00"};
        List<String> citas = new ArrayList<>();
        boolean salir = false;

        while (!salir) {
            System.out.println("=== EPS - Área de Pacientes ===");
            System.out.println("1. Ver horarios disponibles");
            System.out.println("2. Agendar cita");
            System.out.println("3. Cancelar cita");
            System.out.println("4. Ver mis citas");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\nDía 10/10/2025");
                    for (String h : horas) System.out.println("- " + h);
                    break;
                case 2:
                    System.out.print("Hora (9:00, 10:00, 11:00, 12:00): ");
                    String hora = sc.nextLine();
                    System.out.print("Tipo de cita: ");
                    tipoCita = sc.nextLine();
                    System.out.print("Nombre completo: ");
                    nombre = sc.nextLine();
                    System.out.print("Identificación: ");
                    id = sc.nextLine();
                    System.out.print("Teléfono: ");
                    telefono = sc.nextLine();
                    System.out.print("Dirección: ");
                    direccion = sc.nextLine();
                    System.out.print("Motivo de la cita: ");
                    motivo = sc.nextLine();
                    String cita = "Cita " + tipoCita + " - " + hora + " - " + nombre;
                    citas.add(cita);
                    System.out.println("\nCita guardada exitosamente.\n");
                    break;
                case 3:
                    if (citas.isEmpty()) {
                        System.out.println("No tienes citas agendadas.");
                    } else {
                        System.out.println("Tus citas:");
                        for (int i = 0; i < citas.size(); i++)
                            System.out.println((i + 1) + ". " + citas.get(i));
                        System.out.print("Número de cita a cancelar: ");
                        int c = sc.nextInt();
                        sc.nextLine();
                        if (c > 0 && c <= citas.size()) {
                            citas.remove(c - 1);
                            System.out.println("Cita cancelada.");
                        } else System.out.println("Número inválido.");
                    }
                    break;
                case 4:
                    if (citas.isEmpty()) System.out.println("No tienes citas registradas.");
                    else {
                        System.out.println("\n=== Citas registradas ===");
                        for (String c : citas) System.out.println(c);
                    }
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println();
        }
        sc.close();
    }
}