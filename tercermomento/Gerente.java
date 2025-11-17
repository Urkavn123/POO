public class Gerente extends empleado {
    private double presupuesto;

    public Gerente (String nombre, double salario, double presupuesto){
        super(nombre, salario);
        this.presupuesto = presupuesto;
    }
    @Override
    public String info(){
        return nombre + " tiene un salario de: " + salario + "y un presupuesto de: " + presupuesto;
    }
    @Override
    public double calcularBono(){
        return salario * 0.20; //bono del 20% por ser gerente

    }
    
    

}
