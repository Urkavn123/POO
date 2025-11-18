public class main {
    public static void main(String[] args) {
        
        Gerente Pablo = new Gerente("Pablo", 5000, 20000);
        ingeniero Juan = new ingeniero("Juan", 3500, "Software");

        System.out.println(Pablo.info());
        System.out.println(Juan.info());

        Pablo.calcularBono();
        Juan.calcularBono();
    }
}
