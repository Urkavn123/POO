    class principal {
   public static void main(String[] args) {
      cuentaBancaria cuenta1 = new cuentaBancaria("juan", "4326245", 3000.0D);
      cuentaBancaria cuenta2 = new cuentaBancaria("", "354", -500.0D);
      System.out.println("------- Cuenta 1 -------");
      System.out.println(cuenta1);
      System.out.println("------- Cuenta 2 -------");
      System.out.println(cuenta2);
      //depositar
      cuenta1.depositar(2000);
      cuenta2.depositar(-500);

      cuenta1.retirar(1000);
      cuenta2.retirar(500);
      System.out.println("Tu saldo es:" + cuenta1.getsaldo());
      System.out.println("El titular de la cuenta es: " + cuenta2.getTitular());
      cuenta1.setTitular("Pablo");
      cuenta2.setnumerocuenta("345345");
      System.out.println("\n ------- Mostrar resultados finales -------");
      System.out.println("Cuenta 1");
      System.out.println(cuenta1);
      System.out.println("cuenta 2");
      System.out.println(cuenta2);
   }
}
    