public class empleado {
    protected String nombre;
    protected double salario;

    public empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }
     public String info(){
        return nombre + "tiene un salario de: " + salario;
     }
     public double calcularBono(){
        return salario * 0.5;
     }
}