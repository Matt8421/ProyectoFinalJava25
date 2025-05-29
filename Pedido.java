import java.util.ArrayList;

import proyectoFinal.Producto;

//Clase que representa un pedido
public class Pedido {
    
    //Variable de clase (static) que se usa para enumerar automaticamente los pedidos
    private static int contadorPedidos = 1;                                                       //static int contadorPedidos: garantiza que cada nuevo pedido tenga un número único.

    //Numero de este pedido en particular
    private int numeroPedido;

    //Lista de productos que contiene este pedido
    private ArrayList<Producto> productos;                                    //ArrayList<Producto>: usa herencia/polimorfismo para aceptar cualquier tipo de Producto.

    //Constructor del pedido
    public Pedido() {
        this.numeroPedido = contadorPedidos++;  //Asigna un numero unico y lo incrementa para el proximo pedido
        this.productos = new ArrayList<>();    //Inicializa la lista vacia de productos
    }

    //Getter para obtener el numero del pedido
    public int getNumeroPedido() {
        return this.numeroPedido;
    }

    //Metodo para mostrar los detalles del pedido
    public void mostrarPedido(){
        System.out.println("Pedido N°: " + this.numeroPedido);  //Muestra el numero del pedido

        //Si la lista esta vacia , muestra un mensaje indicando que no hay productos
        if(productos.isEmpty()){
            System.out.println("No hay productos en este pedido");
        } else {
            //Recorre todos los productos del pedido y muestra sus detalles
            //Esto usa polimorfismo: cada clase hija de Producto implementa su propia version de mostrarDetalle()
            for(Producto p : productos){
                p.mostrarDetalle();                        //mostrarDetalle(): este método se ejecuta distinto según si es Articulo, ProductoTecnologico, etc.


            }
        }
    } 





}
