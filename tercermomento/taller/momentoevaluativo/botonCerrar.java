public class botonCerrar extends Boton{

    public botonCerrar(int id) {
        super(id, "Cerrar puerta");
    }

    @Override
    public void accion(){
        System.out.println("Boton cerrar: accion ejecutada");
    }
}
