/**
 * Botón externo ubicado en un piso del edificio.
 * Puede ser un botón de SUBIR o BAJAR dependiendo del piso.
 * Al presionarlo, registra una solicitud para que el ascensor venga.
 */
public class botonPiso extends Boton {
    private int piso;
    private Direction direccion;
    private sistemaControl sistema;

    public botonPiso(int id, int piso, Direction direccion, sistemaControl sistema){
        super(id, "Boton " + direccion + "Piso " + piso );
        this.piso = piso;
        this.direccion = direccion;
        this.sistema = sistema;
    }

    @Override
    public void accion(){
        System.out.println("📢 Solicitud desde piso " + piso + " para ir " + direccion + ".");
        sistema.registrarSolicitudPiso(piso, direccion);
    }


}
