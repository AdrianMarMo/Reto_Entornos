
package modelo;
import java.util.*;

/**
 *
 * @author Adrian Martin Mora
 */
    
public class FuncionesAgenda {
    private String[] nombres;
    private String[] telefonos;
    private int cantidad;
    
    
    // Constructor
    public FuncionesAgenda(int tamaño) {
        nombres = new String[tamaño];
        telefonos = new String[tamaño];
        cantidad = 0;
    }

    // Método para agregar un contacto
    public void agregarContacto(Scanner sc) {
       
        if (cantidad < nombres.length) {
            System.out.print(" Ingresa el nombre: ");
            nombres[cantidad] = sc.nextLine();
            System.out.print(" Ingresa el teléfono: ");
            telefonos[cantidad] = sc.nextLine();
            cantidad++;
            System.out.println(" Contacto agregado con éxito.");
        } else {
            System.out.println(" La agenda está llena.");
        }
        
    }

    // Método para mostrar todos los contactos
    public void mostrarContactos() {
        System.out.println("\n LISTA DE CONTACTOS ");
        if (cantidad == 0) {
            System.out.println(" No hay contactos guardados.");
        } else {
            for (int i = 0; i < cantidad; i++) {
                System.out.println((i + 1) + ". " + nombres[i] + " - " + telefonos[i]);
            }
        }
    }

    // Método para buscar un contacto por nombre
    public void buscarContacto(Scanner sc) {
        System.out.print(" Ingresa el nombre a buscar: ");
        String nombreBuscar = sc.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < cantidad; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscar)) {
                System.out.println(" Contacto encontrado: " + nombres[i] + " - " + telefonos[i]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println(" Contacto no encontrado.");
        }
    }

    // Método para eliminar un contacto
    public void eliminarContacto(Scanner sc) {
        System.out.print(" Ingresa el nombre del contacto a eliminar: ");
        String nombreEliminar = sc.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < cantidad; i++) {
            if (nombres[i].equalsIgnoreCase(nombreEliminar)) {
                // Mover los elementos hacia atrás para llenar el espacio vacío
                for (int j = i; j < cantidad - 1; j++) {
                    nombres[j] = nombres[j + 1];
                    telefonos[j] = telefonos[j + 1];
                }
                cantidad--;  // Reducir el contador de contactos
                System.out.println(" Contacto eliminado con éxito.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println(" Contacto no encontrado.");
        }
    }
   
}
