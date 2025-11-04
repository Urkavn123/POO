
import java.util.Arrays;
import java.util.Date;

public class Pedido {
    
    private Cliente2 cliente;
    private Date fecha;
    private int numeroTarjetaCredito;
    private Producto[] productos;

    public Pedido (Cliente2 cliente, Date fecha, int numeroTarjetaCredito, Producto[] productos) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
        this.productos = productos;
    }

    @Override
    public String toString(){
       return "Pedido {cliente: "+ cliente + 
       "\nfecha: "+ fecha + 
       "\nnumero de la tarjeta de credito: " + numeroTarjetaCredito + 
       "\nproductos: [ " + Arrays.toString(productos)  +" ] }";
    }



}
