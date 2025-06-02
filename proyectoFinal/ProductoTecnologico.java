package proyectoFinal;


  //Subclase de articulo que representa un producto tecnologico

public class ProductoTecnologico extends Articulo {

  //Atributo adicional exclusivo (marca) de los productos tecnologicos
private String marca;

 //Constructor que inicializa los atributos heredados y el nuevo atributo marca
public ProductoTecnologico(int id, String nombre, double precio, String marca){

 //Llama al constructor de la clase padre (Articulo)
 //y le pasa id, nombre y precio
    super(id, nombre, precio);
 //Asigna la marca especifica del producto tecnologico
    this.marca = marca;
}

 //Metodo setter para modificar el valor de la marca
public void setMarca(String marca){
    this.marca = marca;
}
  // Getter por si más adelante lo necesitamos
    public String getMarca() {
        return this.marca;
    }

 //Sobreescribimos el metodo abstracto mostrarDetalle() que viene desde Producto
 //Este metodo muestra en consola toda la info del producto
@Override
public void mostrarDetalle(){
    System.out.println(
    "ID: " + getId() +                  //Muestra el ID(heredado)
    " | Nombre: " + getNombre() +       //Muestra el nombre(heredado)
    " | Precio: $" + getPrecio() +       //Muestra el precio(Definido en articulo)
    " | Marca: " + marca              //Muestra la marca (Definico aca)

    );
}
    // Sobrescritura de toString() para mostrar la info del producto
  @Override
    public String toString() {
        return "ProductoTecnologico{" +                                //Reemplazamos "Articulo{" por "ProductoTecnologico{".
                "id=" + this.getId() +
                ", nombre='" + this.getNombre() + '\'' +        
                ", precio=" + this.getPrecio() +                //Evitamos el error de poner ' después de getPrecio() que lo mostraba como texto cuando en realidad es un número.
                ", Marca=" + this.marca + '\'' +                          //Agregamos comillas en marca porque es un texto (String).
                '}';
    }

}
