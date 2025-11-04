import java.util.Arrays;

public class Impresion extends Producto {

    private String Color;
    private Foto[] fotos;

    public Impresion (int numero, String Color, Foto[] fotos){
        super(numero);
        this.Color = Color;
        this.fotos = fotos;
    }

    @Override

    public String toString(){
        return "Impresion {" + "numero: " + numero + ", color: " + Color + ", fotos: " + Arrays.toString(fotos) + "}";
    }


}