public class ejecutarBanco {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(123435, 1000);
        Banco banco1 = new Banco("BanColombia", cuenta1);

        System.out.println(banco1);

        Cliente2 cliente1 = new Cliente2(1113861, "juan");

        String msg = banco1.crearCliente(cliente1) ? "cliente creado exitosamente" : "Error al crear cliente";
        System.out.println(msg);
    }

}
