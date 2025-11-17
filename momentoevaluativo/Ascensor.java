public class Ascensor {
    private int totalPisos;
    private int pisoActual;
    private int pisoDestino;
    private Puerta puerta;
    private Direction direccion;
    private estadoAscensor estado;
    //botones internos
    private Boton botonAbrir;
    private Boton botonCerrar;
    private Boton botonEmergencia;

    public Ascensor (int totalPisos){
        this.totalPisos = totalPisos;
        this.pisoActual = 1;
        this.pisoDestino = -1;
        this.puerta = new Puerta();
        this.direccion = null;
        this.estado = estadoAscensor.DETENIDO;
        //botones internos
        this.botonAbrir = new botonAbrir(1);
        this.botonCerrar = new botonCerrar(2);
        this.botonEmergencia = new botonEmergencia(3);
    }
    //getters
    public int getPisoActual(){
        return pisoActual;
    }
    public int getPisoDestino(){
        return pisoDestino;
    }
    public Direction getDireccion(){
        return direccion;
    }
    public estadoAscensor getEstado(){
        return estado;
    }
    public Puerta puerta(){
        return puerta;
    }

    //asigancion del destino
    public boolean asignarDestino(int piso){
        if (piso == pisoActual){
            System.out.println("El ascensor ya esta en el piso: " + piso + ".");
            if (!puerta.getAbierta()) {
            puerta.abrir();
            estado = estadoAscensor.PUERTAS_ABIERTAS;
        }
            return false;
        }else 
        
        pisoDestino = piso;
        System.out.println("Destino seleccionado: piso " + pisoDestino);

        if (puerta.getAbierta()){
            System.out.println("puertas cerrandose");
            puerta.cerrar();
        }
        if (!puerta.getAbierta()){
            mover();
        }
        return true;
    }

    //abrir puerta
    public void presionarAbrir(){
        botonAbrir.presionar();
        puerta.abrir();
        estado = estadoAscensor.PUERTAS_ABIERTAS;
    }

    public void presionarCerrar(){
        botonCerrar.presionar();
        if (puerta.getMantenerAbierta()){
            System.out.println("No se puede cerrar: puertas abiertas");
        }

        else if (puerta.getObstaculo()){
            System.out.println("No se puede cerrar: obstaculo detectado");
         }
         else if (pisoDestino != -1 && estado != estadoAscensor.EMERGENCIA) {
        System.out.println(" Reanudando viaje al piso " + pisoDestino + "...");
        while (pisoDestino != -1 && estado != estadoAscensor.EMERGENCIA) 
            mover();
         }else{
            puerta.cerrar();;
            estado = estadoAscensor.DETENIDO;
        }

        
    }


    public void presionarEmergencia(){
        botonEmergencia.presionar();
        estado = estadoAscensor.EMERGENCIA;

        pisoDestino = -1;
        direccion = null;

        System.out.println("!EMERGENGIA ... EMERGENCIA¡");
        puerta.abrir();
    }
    //mover ascensor

    public void mover(){
        if (estado == estadoAscensor.EMERGENCIA){
            System.out.println("No se puede mover: EMERGENCIA ACTIVADA");
            return;
        }
        if (puerta.getAbierta()) {
    System.out.println("El ascensor no puede moverse con la puerta abierta.");
    // Cancelar destino para evitar bucles infinitos, aprendi mi leccion:
    pisoDestino = -1;
    direccion = null;
    estado = estadoAscensor.PUERTAS_ABIERTAS;
    return;
        }
        if (pisoDestino == -1){
            System.out.println("No se ah seleccionado un destino");
            return;
        }

        //determinar su direccion
        if (pisoDestino > pisoActual){
            direccion = Direction.UP;
        }
        else if (pisoDestino < pisoActual){
            direccion = Direction.DOWN;
        }else {
            direccion = null; //ya estaria en el piso
            
        }
        
        estado = estadoAscensor.MOVIENDO;
//mover un piso
        if (direccion == Direction.UP){
            pisoActual++;
            System.out.println("Subiendo... piso actual " + pisoActual);
        }

        else if (direccion == Direction.DOWN){
            pisoActual--;
            System.out.println("Bajando... piso actual "+ pisoActual);
        }

        //si llego al destino
        if (pisoActual == pisoDestino){
            llegar();
        }

    }
    private void llegar(){
        System.out.println("Llegaste al piso " + pisoDestino);
        pisoDestino = -1;
        direccion = null;
        estado = estadoAscensor.DETENIDO;

        puerta.abrir();
        estado = estadoAscensor.PUERTAS_ABIERTAS;

        if (!puerta.getMantenerAbierta() && puerta.getObstaculo()){
            puerta.cerrar();
            estado = estadoAscensor.DETENIDO;
            System.out.println("puertas cerradas automaticamente");
        }else {
            System.out.println("las puertas se mantendran abiertas ");
        }
    }
}

