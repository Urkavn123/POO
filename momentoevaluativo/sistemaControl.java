public class sistemaControl {

    private Piso[] pisos;
    private Ascensor ascensor;
    private int totalPisos;

    private int solicitudPiso = -1;
    private Direction solicitudDireccion = null;

    public sistemaControl(int totalPisos) {
        this.totalPisos = totalPisos;
        ascensor = new Ascensor(totalPisos);
        pisos = new Piso[totalPisos + 1];

        for (int i = 1; i <= totalPisos; i++) {
            pisos[i] = new Piso(i, totalPisos, this);
        }
    }

    public void registrarSolicitudPiso(int piso, Direction direccion) {

        if (piso < 1 || piso > totalPisos) {
            System.out.println("❌ Piso inválido. Solo existen pisos del 1 al " + totalPisos);
            return;
        }

        if (ascensor.getPisoActual() == piso) {
            System.out.println("🟢 El ascensor ya está en el piso " + piso);

            if (!ascensor.puerta().getAbierta()) {
                ascensor.puerta().abrir();
                System.out.println("🚪 Puertas abiertas, puedes entrar.");
            }
            return;
        }

        System.out.println("📢 Solicitud recibida: piso " + piso + " dirección " + direccion);
        System.out.println("Ascensor en camino...");

        ascensor.asignarDestino(piso);

        while (ascensor.getPisoDestino() != -1 && ascensor.getEstado() != estadoAscensor.EMERGENCIA) {
            ascensor.mover();
        }
    }

    public void ejecutar() {
        if (solicitudPiso != -1 && ascensor.getPisoDestino() == -1) {
            System.out.println("Ascensor en camino...");
            ascensor.asignarDestino(solicitudPiso);

            solicitudPiso = -1;
            solicitudDireccion = null;
        }

        while (ascensor.getPisoDestino() != -1 && ascensor.getEstado() != estadoAscensor.EMERGENCIA) {
            ascensor.mover();
        }
    }

    public Piso getPiso(int num) {
        return pisos[num];
    }

    public Ascensor getAscensor() {
        return ascensor;
    }
}
