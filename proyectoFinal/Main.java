package proyectoFinal;

import java.util.ArrayList;
import java.util.Scanner;


// Clase Principal del programa
public class Main {
    // Lista que almacena objetos de tipo Articulo
    static ArrayList<Articulo> lista = new ArrayList<>();  //Atributos de la clase xq tiene la palabra reservada static
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
    }                           //Fin del metodo que ejecuta el programa

    //Metodo para crear un nuevo Articulo
    /* public static void crearArticulo() { 
        System.out.print("ID: ");                  //Para leer un número entero 
        int id = sc.nextInt(); sc.nextLine();        //Leer ID del articulo  y sc.nextLine() para leer una línea de texto
        System.out.print("Nombre: ");              
        String nombre = sc.nextLine();               //Leer nombre del articulo
        System.out.print("Precio: ");
        double precio = sc.nextDouble();             //Leer precio del articulo

        //Crear un nuevo objeto Articulo y agregarlo a la lista
        Articulo nuevo = new Articulo(id, nombre, precio);
        lista.add(nuevo);
        System.out.println("Artículo agregado");    // FIN del método que crea un artículo
    } */

     // método que crea un artículo con validaciones
    public static void crearArticulo() {
        int id;
        String nombre;
        double precio;

        // Validación: verificar que el ID no exista previamente
        while (true) {
            System.out.print("ID: ");
            id = sc.nextInt(); sc.nextLine();     //Limpiamos buffer

            boolean idExiste = false;
            for (Articulo a : lista) {
                if (a.getId() == id) {
                    idExiste = true;
                    break;
                }
            }
            if (idExiste) {
                System.out.println("⚠️ El ID ya existe. Ingresá otro.");
            } else {
                break;
            }
        }
        // Validación: el nombre no puede estar vacío
        while (true) {
            System.out.print("Nombre: ");
            nombre = sc.nextLine();
            if (nombre.trim().isEmpty()){
                System.out.println("⚠️ El nombre no puede estar vacío.");
                } else {
                    break;
                }
        }
        // Validación: el precio debe ser mayor a 0
        while (true) {
            System.out.print("Precio: ");
            precio = sc.nextDouble(); sc.nextLine();   //Limpiamos Buffer

            if (precio <= 0) {
                System.out.println("⚠️ El precio debe ser mayor a 0.");
            } else {
                break;
            }
        }
        // Creamos un nuevo objeto Articulo usando los valores validados
        Articulo nuevo = new Articulo(id, nombre, precio);

        //Agregamos el objeto en la lista
        lista.add(nuevo);
        System.out.println("✅ Artículo agregado correctamente.");
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
      // public = puedo acceder desde cualquier parte del programa
    // static = no necesito crear un objeto de la clase para acceder al método
    
    //Metodo para modificar un articulo existente
    public static void modificarArticulo() {
        System.out.print("ID del artículo a modificar: ");
        int id = sc.nextInt();
        for (Articulo articulo : lista) {                             // Recorremos todos los productos almacenados en la lista
            if (articulo.getId() == id) {                             // Verificamos si el ID del producto actual coincide con el buscado
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
        int idAEliminar = sc.nextInt();
        //Usamos removeIf con expresion lambda para eliminar el articulo por ID
        // PARA LA PRE ENTREGA QUE MUESTRE UN MSJ DE ARTICULO NO ENCONTRADO SI NO LOGRA ELIMINAR NINGUN ARTICULO
        lista.removeIf(a -> a.getId() == idAEliminar);
        System.out.println("Artículo eliminado si existia");
    }


}
