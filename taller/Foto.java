public class Foto {
    private  String Fichero;

    public Foto(String Fichero){
        this.Fichero = Fichero;

    }

    public void print(){
        System.out.println("Imprimiendo foto: " + Fichero);
    }

    @Override

    public String toString(){
        return "Foto {" + "fichero: " + Fichero +  "}";
    }
}
