package proyectoFinal;


    //Articulo hereda de producto e implementa la interfaz vendible
public class Articulo extends Producto implements Vendible{
    //Atributo privado especifico de Articulo (para aplicar encapsulamiento) 
    
    private double precio;

    //Constructor para inicializar el objeto Articulo
    //Recibe los atributos id, nombre y precio
    public Articulo(int id, String nombre, double precio) {
        super(id, nombre);   //Llamada al constructor de la clase base Producto(Superclase)
        this.precio = precio; //Asigna el precio al atributo local
    }

    //Getter para el atributo precio (Solo lectura)
    //Este metodo viene de la interfaz Vendible
    @Override
    public double getPrecio() {
        return this.precio;
    }

    //Metodo que sobreescribe el metodo abstracto mostrarDetalle() de Producto
    //Este metodo muestra la informacion completa del articulo
    @Override
    public void mostrarDetalle() {
        //Uso de los metodos getId() y getNombre() heredados de Producto
        System.out.println(
            "ID: " + getId() + 
            " | Nombre: " + getNombre() +
            " | Precio: $" + getPrecio()
        );
    }
    //Metodo implementado desde la interfaz vendible
    //Calcula el precio final del articulo ( en este caso es el mismo que el precio base)
    //Se puede extender mas adelante para incluir impuestos, desctos , etc.
    @Override
    public double calcularPrecioFinal() {
        return this.precio;
    }
    

    

    
}
