/*
 Clase base para todos los botones del sistema de ascensor.
Define comportamiento común: iluminación, sonido y ejecución de acción.
 */
public abstract  class Boton {
    protected  int id;  // identificador del boton
    protected String nombre;
    protected boolean iluminado;

    public Boton (int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.iluminado = false;
    }

    public void presionar(){
        iluminar();
        emitirSonido();
        accion();
    }

    public void iluminar(){
        iluminado = true;
        System.out.println("🔆");
    }

    public void apagar(){
        iluminado = false;
        System.out.println("¡Boton "  + nombre + " apagado");
    }

    public void emitirSonido(){
        System.out.println("¡DING!");
    }

    public abstract void accion();
/*  La clase es abstracta porque define el comportamiento común de todos los botones,
pero no puede determinar la acción concreta que debe ejecutarse al presionarlo.
 Cada subclase debe implementar su propia lógica en el método accion(),
 garantizando polimorfismo y evitando crear objetos de un botón genérico.
*/

    //getters
         public boolean estaIluminado() {
            return iluminado; 
        }
         public int getId() {
            return id;
        }
         public String getNombre() {
            return nombre;
        }
    }

