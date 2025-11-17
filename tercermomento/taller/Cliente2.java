public class Cliente2 {
    
    private String Cedula;
    private String Nombre;

    public Cliente2 (String Cedula, String Nombre){
        this.Cedula = Cedula;
        this.Nombre = Nombre;
    }

    public String getCedula(){
        return Cedula;
    }
    public String getNombre(){
        return Nombre;    
    }

    @Override

    public String toString() {
        return "Cliente {" + "cedula: "+ Cedula + ", nombre: "+ Nombre + "}";
    }
}
