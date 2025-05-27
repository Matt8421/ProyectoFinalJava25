package proyectoFinal;


    //Clase base Articulo con encapsulamiento
public class Articulo {
    //Atributos privados para aplicar encapsulamiento
    private int id;
    private String nombre;
    private double precio;

    //Constructor para inicializar el objeto Articulo
    public Articulo(int id, String nombre, double precio) {
        this.id = id;                                   //"This" alude al atributo del objeto
        this.nombre = nombre;
        this.precio = precio;
    }

    //Getter para el atributo id (Solo lectura)
    //Public se puede acceder desde cualquier parte del sistema
    //int es el tipo de dato que devuelve el metodo
    public int getId() {
        return this.id;
    }
    //No uso setter para el ID

    //Getter para el atributo nombre
    public String getNombre() {
        return this.nombre;
    }

    //Setter para modificar el atributo nombre
    public void setNombre(String nombreParametro) {
        this.nombre = nombreParametro;
    }

    //Getter para el atributo precio
    public double getPrecio() {
        return this.precio;
    }

    //Setter para modificar el atributo precio
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Metodo para mostrar la informacion del articulo
    public void mostrarArticulo() {
        //Este metodoa puede ser sobrescrito por subclases (Polimorfismo)
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Precio: $" + precio);
    }
}
