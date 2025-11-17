public class Piso {
    private int numero;
    private botonPiso botonSubir;
    private botonPiso botonBajar;

    public Piso(int numero, int totalPisos, sistemaControl sistema){
        this.numero = numero;
        if (numero == 1){
            botonSubir = new botonPiso(1, numero, Direction.UP, sistema);
            botonBajar = null;
        }
        else if (numero == totalPisos){
            botonSubir = null;
            botonBajar = new botonPiso(2, numero, Direction.DOWN, sistema);
        }
        else {
            botonSubir = new botonPiso(1, numero, Direction.UP, sistema);
            botonBajar = new botonPiso(2, numero, Direction.DOWN, sistema);
        }
    }

    public int getNumero(){
        return numero;
    }

    public botonPiso getBotonSubir(){
        return botonSubir;
    }

    public botonPiso getBotonBajar(){
        return botonBajar;
    }

    public void presionarSubir(){
        if (botonSubir == null){
            System.out.println("Este piso no tiene boton para subir");
        }
        else {
            botonSubir.presionar();
        }
    }
    public void presionarBajar(){
        if (botonBajar == null){
            System.out.println("Este piso no tien boton para bajar");
        }
        else{
            botonBajar.presionar();
        }
    }


}