

// Interfaz que representa a cualquier objeto que puede ser vendido

public interface Vendible {

// Método para obtener el precio del objeto
// Es obligatorio implementarlo en cualquier clase que implemente Vendible

    double getPrecio();

 // Método para establecer o modificar el precio del objeto
    void setPrecio(double precio);
}


//Las interfaces definen un contrato: si una clase la implementa, tiene que crear los métodos que la interfaz declara.
//Te permite usar polimorfismo: por ejemplo, podés tener una lista de objetos Vendible y recorrerla sin importar si son Articulo, ProductoTecnologico, o lo que sea.