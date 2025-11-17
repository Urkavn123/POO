public class Camara extends Producto{
    private String Marca;
    private String Modelo;

    public Camara (int numero, String Marca, String Modelo){
        super(numero);
        this.Marca = Marca;
        this.Modelo = Modelo;
    }

    @Override

    public String toString(){
        return "Camara {" + "numero: " + numero + ", marca: " + Marca + ", modelo: " + Modelo + "}";
    }

}
