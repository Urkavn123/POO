public class cuentaBancaria {
   private String titular;
   private String numeroCuenta;
   private double saldo;

   public cuentaBancaria() {
      this.titular = this.titular;
      this.numeroCuenta = this.numeroCuenta;
      this.saldo = this.saldo;
   }

   public cuentaBancaria(String titular, String numeroCuenta, double saldo) {
      if (titular != null && !titular.isEmpty()) {
         this.titular = titular;
      } else {
         this.titular = "titular invalido";
      }

      if (numeroCuenta != null && numeroCuenta.length() >= 6) {
         this.numeroCuenta = numeroCuenta;
      } else {
         this.numeroCuenta = "000000";
      }

      if (saldo >= 0.0) {
         this.saldo = saldo;
      } else {
         this.saldo = 0.0;
      }

   }

   public String getTitular() {
      return this.titular;
   }

   public void setTitular(String titular) {
      if (titular != null && !titular.isEmpty()) {
         this.titular = titular;
      } else {
         this.titular = "Titular invalido";
      }

   }

   public String getnumeroCuenta() {
      return this.numeroCuenta;
   }

   public void setnumerocuenta(String numeroCuenta) {
      if (numeroCuenta != null && numeroCuenta.length() >= 6) {
         this.numeroCuenta = numeroCuenta;
      } else {
         this.numeroCuenta = "000000";
      }

   }

   public double getsaldo() {
      return this.saldo;
   }

   public void setsaldo(double saldo) {
      if (saldo >= 0.0) {
         this.saldo = saldo;
      } else {
         this.saldo = 0.0;
      }

   }

   public void depositar(double monto) {
      if (monto > 0) {
         this.saldo += monto;
      } else {
         System.out.println("El monto debe ser mayor que 0");
      }

   }

   public void retirar(double monto) {
      if (monto > 0 && monto <= this.saldo) {
         this.saldo -= monto;
      } else {
         System.out.println("El monto es invalido");
      }

   }

   public String toString() {
      return " Titular: " + this.titular + 
             "\nNúmero de cuenta: " + this.numeroCuenta +
             "\nSaldo: " + this.saldo;
   } 
}
    