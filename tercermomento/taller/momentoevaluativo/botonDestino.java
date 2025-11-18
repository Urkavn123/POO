public class botonDestino extends Boton {

    private Ascensor ascensor;
    private int pisoDestino = -1;

    public botonDestino(int id, Ascensor ascensor){
        super(id, "Selecionar destino");
        this.ascensor = ascensor;
    }

    public  void setDestino(int piso){
        this.pisoDestino = piso;
    }

    @Override
    public void accion(){
        System.out.println("Botón destino: solicitando piso " + pisoDestino);
        ascensor.asignarDestino(pisoDestino);
    }
     
}
