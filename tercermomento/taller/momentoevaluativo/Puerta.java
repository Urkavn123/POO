public class Puerta {
    private  boolean abierta = false;
    private  boolean obstaculo = false;
    private  boolean mantenerAbierta = false;

    public void abrir(){
        System.out.println("Puerta abriendo");
        abierta = true;
    }

    public void cerrar(){
        if (Math.random() < 0.25) {
            obstaculo = true;
            System.out.println("Obstáculo detectado automáticamente.");
        }
        else if (mantenerAbierta){
            System.out.println("No se puede cerrar: modo mantener abierta activado");
        }
        else if (obstaculo){
            System.out.println("No se puede cerrar: obstaculo detectado");
        }
        else {
            System.out.println("Puerta cerrando");
            abierta = false;
        }
        }
        public void  setMantenerAbierta(boolean valor){
            mantenerAbierta = valor;
            
            if (valor) {
                System.out.println("Modo mantener puerta abierta activado");
            }else {
                System.out.println("Modo mantener puerta abierta desactivado");
            }
         }
         //setter
        public void setObstaculo(boolean valor) {
            obstaculo = valor;
            if (valor){
                System.out.println("Obstaculo detectaod");
            }else{
                System.out.println("Obstaculo retirado");
            }
        }
        //getter
        public boolean getObstaculo(){
            return obstaculo;
        }

        public boolean getAbierta() {
            return abierta;
        }
        public boolean getMantenerAbierta() {
            return mantenerAbierta;
        }
    
}

