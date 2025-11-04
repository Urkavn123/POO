import java.util.Date;
public class Ejecutar {
    public static void main(String[] args) {
        
        Cliente2 cliente1 = new Cliente2("1113861", "juan");

        Foto f1 = new Foto("foto1.jpg");
        Foto f2 = new Foto("foto2.jpg");
        Foto[] fotos = {f1, f2};

        Impresion impresion = new Impresion(1, "color", fotos);
        Camara camara = new Camara(1, "GoPro", "Hero 12 Black");
        Producto[] productos = { impresion, camara};

        Pedido pedido1 = new Pedido(cliente1, new Date(), 234666, productos);

        System.out.println(pedido1);

        f1.print();
    }
}
