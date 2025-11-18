  public class productos {
   private String codigo;
   private String descripcion;
   private int cantidad;
   private double precioUnitario;

   public productos() {
      this.codigo = "SIN-CODIGO";
      this.descripcion = "SIN-DESCRIPCION";
      this.cantidad = 1;
      this.precioUnitario = 0.0;
   }

   public productos(String codigo, String descripcion, int cantidad, double precioUnitario) {
      if (codigo != null && !codigo.isEmpty()) {
         this.codigo = codigo;
      } else {
         this.codigo = "SIN-CODIGO";
      }

      if (descripcion != null && !descripcion.isEmpty()) {
         this.descripcion = descripcion;
      } else {
         this.descripcion = "SIN-DESCRIPCION";
      }

      if (cantidad >= 1) {
         this.cantidad = cantidad;
      } else {
         this.cantidad = 1;
      }

      if (precioUnitario >= 0.0) {
         this.precioUnitario = precioUnitario;
      } else {
         this.precioUnitario = 0.0;
      }

   }

   public String getCodigo() {
      return this.codigo;
   }

   public void setCodigo(String codigo) {
      if (codigo != null && !codigo.isEmpty()) {
         this.codigo = codigo;
      } else {
         this.codigo = "SIN-CODIGO";
      }

   }

   public String getDescripcion() {
      return this.descripcion;
   }

   public void setDescripcion(String descripcion) {
      if (descripcion != null && !descripcion.isEmpty()) {
         this.descripcion = descripcion;
      } else {
         this.descripcion = "SIN-DESCRIPCION";
      }

   }

   public int getCantidad() {
      return this.cantidad;
   }

   public void setCantidad(int cantidad) {
      if (cantidad >= 1) {
         this.cantidad = cantidad;
      } else {
         this.cantidad = 1;
      }

   }

   public double getPrecioUnitario() {
      return this.precioUnitario;
   }

   public void setPrecioUnitario(double precioUnitario) {
      if (precioUnitario >= 0.0) {
         this.precioUnitario = precioUnitario;
      } else {
         this.precioUnitario = 0.0;
      }

   }

   public double subTotal() {
      return this.precioUnitario * (double)this.cantidad;
   }

   public void aplicarDescuento(double porcentaje) {
      if (porcentaje > 0.0D && porcentaje <= 50) {
         double descuento = this.precioUnitario * (porcentaje / 100);
         this.precioUnitario -= descuento;
      }

   }

   public void incrementarCantidad(int valor) {
      if (valor > 0) {
         this.cantidad += valor;
      }

   }

   public String toString() {
      String var10000 = this.codigo;
      return " Codigo: " + codigo + 
             "\nDescripcion: " + descripcion +
             "\nCantidad: " + cantidad + 
             "\nPrecio unitario: " + precioUnitario + 
             "\nsubtotal: $" + subTotal();
   }
}