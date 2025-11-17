 class totalProductos {
   public static void main(String[] args) {
      productos p1 = new productos("235", "Gaseosa pepsi 1.5 Litros", 2, 4500);
      System.out.println("---- producto ----");
      System.out.println(p1);
      p1.aplicarDescuento(35);
      p1.incrementarCantidad(3);
      System.out.println("El sub total final es: $" + p1.subTotal());
      System.out.println("El codigo es:" + p1.getCodigo());
      System.out.println("La cantidad es: " + p1.getCantidad());
      p1.setCantidad(6);
      p1.setCodigo("003");
      System.out.println(p1);
   }
}