public class botonAbrir extends Boton {
    
    public botonAbrir(int id){
        super(id, "Abrir puerta");
    }

    @Override
    public void accion(){
        System.out.println("Boton abrir: accion ejecutada");
    }
}
