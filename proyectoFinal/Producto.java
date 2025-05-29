package proyectoFinal;          //Indica el paquete al que pertenece esta clase

    //Esta clase representa un producto general y es abstracta,
    //lo que significa que no se puede crear una instancia directa de ella.
    //Se usan como modelo para que otras clases las extiendan

public abstract class Producto {

    //Atributos comunes a todos los productos
    //Encapsulamiento : Usamos private y métodos get/set para proteger y acceder a los datos.
    
    private int id;          //Identificador unico del producto
    private String nombre;   //Nombre del producto

    //Constructor que recibe el id y el nombre al crear un producto
    public Producto(int id, String nombre) {
        this.id = id;             //Asigna el valor del parametro al atributo id
        this.nombre = nombre;     //Asigna el valor del parametro al atributo nombre
    }

    //Metodo para obtener el id del producto
    public int getId(){
        return id;
    }

    //Metodo para cambiar el nombre del producto
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodo abstracto: Las clases hijas deberan definir su propia version.
    public abstract void mostrarDetalle();









}
