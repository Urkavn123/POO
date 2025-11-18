public class vehiculo {
    protected String marca ;
    protected int velocidad ;
    public vehiculo ( String marca ) {
        this . marca = marca ;
        this . velocidad = 0;
    }
    public void acelerar () { velocidad += 10; }
    public String info () {
        return " Vehiculo " + marca + " va a: " + velocidad + " km/ h " ;}
}
