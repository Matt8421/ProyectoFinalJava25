package proyectoFinal;

import java.util.ArrayList;
import java.util.Scanner;


// Clase Principal del programa
public class Main {
    // Lista que almacena objetos de tipo Articulo
    static ArrayList<Articulo> lista = new ArrayList<>();
    // Scanner para entrada de dator por consola
    static Scanner sc = new Scanner(System.in);

    //Metodo principal
    public static void main(String[] args) {
        int opcion;
        //Bucle  principal del programa con menu interactivo
        do {
            System.out.println("\n--- Menú de Artículos ---");
            System.out.println("1. Crear artículo");  
            System.out.println("2. Listar artículos");
            System.out.println("3. Modificar artículo");
            System.out.println("4. Eliminar artículo");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opción: ");
            opcion = sc.nextInt();                  //Leer opcion del usuario
            sc.nextLine();                          //Limpia el buffer de entrada

            //Estructura switch para manejar las opciones del menu
            switch (opcion) {
                case 1 -> crearArticulo();
                case 2 -> listarArticulos();
                case 3 -> modificarArticulo();
                case 4 -> eliminarArticulo();
                case 5 -> System.out.println("Saliendo ... ");
                default -> System.out.println("Opción invalida");
        }
        } while (opcion != 5);  //Repetir hasta que el usuario elija salir
    }

    //Metodo para crear un nuevo Articulo
    public static void crearArticulo() { 
        System.out.print("ID: ");
        int id = sc.nextInt(); sc.nextLine();        //Leer ID del articulo
        System.out.print("Nombre: ");              
        String nombre = sc.nextLine();               //Leer nombre del articulo
        System.out.print("Precio: ");
        double precio = sc.nextDouble();             //Leer precio del articulo

        //Crear un nuevo objeto Articulo y agregarlo a la lista
        Articulo nuevo = new Articulo(id, nombre, precio);
        lista.add(nuevo);
        System.out.println("Artículo agregado");
    }

    //Metodo para mostrar todos los articulos de la lista
    public static void listarArticulos() {
        if (lista.isEmpty()) {
            System.out.println("No hay artículos cargados");
            } else {
                for (Articulo a : lista) {
                    a.mostrarArticulo();                                             //LLamada poliformica al metodo mostrar()
                }  
        }
    }    
    
    
    //Metodo para modificar un articulo existente
    public static void modificarArticulo() {
        System.out.print("ID del artículo a modificar: ");
        int id = sc.nextInt();
        for (Articulo articulo : lista) {
            if (articulo.getId() == id) {
                sc.nextLine();
                System.out.print("Nuevo nombre: ");                //Usar setter para modificar el nombre
                articulo.setNombre(sc.nextLine());
                System.out.print("Nuevo precio: ");
                articulo.setPrecio(sc.nextDouble());                 //Usar setter prar cambiar precio
                System.out.print("Artículo actualizado");
                return;
            }
        }
        System.out.println("Artículo no encontrado");
    }

    //Metodo pra eliminar un articulo por ID
    public static void eliminarArticulo() {
        System.out.print("ID del artículo a eliminar: ");
        int id = sc.nextInt();
        //Usamos removeIf con expresion lambda para eliminar el articulo por ID
        lista.removeIf(a -> a.getId() == id);
        System.out.println("Artículo eliminado si existia");
    }


}
