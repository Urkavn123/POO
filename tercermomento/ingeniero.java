public class ingeniero extends empleado {
    private String especializacion;
    
    public ingeniero (String nombre, double salario, String especializacion){
        super(nombre, salario);
        this.especializacion = especializacion;
    }

    @Override
    public String info(){return nombre + " tiene un salario de: " + salario + "y se especializa en: " + especializacion;
}
    @Override
    public double calcularBono(){
        return salario * 0.15; //bono del 15% para ingenieros
    }
        
    }
    
