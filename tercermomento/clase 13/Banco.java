public class Banco {
        
    private String nombre;
    private Cuenta cuenta;

    public Banco(String nombre, Cuenta cuenta) {
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    public boolean crearCliente(Cliente2 cliente) {
        // Lógica para crear un cliente en el banco
        return true; // Suponiendo que siempre se crea con éxito
    }
    
    @Override
    public String toString() {
        return "Banco {" + " nombre= " + nombre + ", cuenta= " + cuenta + "}";
    }

}