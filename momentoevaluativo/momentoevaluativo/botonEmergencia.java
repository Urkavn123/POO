public class botonEmergencia extends Boton{

    public botonEmergencia(int id){
        super(id, "boton de emergencia");
    }
    
    @Override
    public void accion(){
        System.out.println("EMERGENCIA ACTIVADA");
    }
}
