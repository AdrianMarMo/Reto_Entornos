

package vista;

import modelo.FuncionesAgenda;
import java.util.Scanner;
/**
 * Agenda para introducir los contactos para los distintos eventos
 * 
 * @author Adrian Martin Mora
 */
public class AgendaContactos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FuncionesAgenda agenda = new FuncionesAgenda(10);  // Crear la agenda con 10 contactos
        int opcion;

        do {
            System.out.println("\n AGENDA DE CONTACTOS ");
            System.out.println("1. Agregar Contacto");
            System.out.println("2. Mostrar Contactos");
            System.out.println("3. Buscar Contacto");
            System.out.println("4. Eliminar Contacto");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();  // Consumir el salto de línea

            switch (opcion) {
                case 1: agenda.agregarContacto(sc);break;
                case 2: agenda.mostrarContactos(); break;
                case 3: agenda.buscarContacto(sc); break;
                case 4: agenda.eliminarContacto(sc); break;
                case 5: System.out.println("👋 Saliendo de la agenda..."); break;
                default: System.out.println("❌ Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
