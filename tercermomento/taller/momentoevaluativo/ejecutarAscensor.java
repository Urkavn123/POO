import java.util.Random;
import java.util.Scanner;

public class ejecutarAscensor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("=== SISTEMA DE CONTROL DE ASCENSOR ===");
        System.out.print("Ingrese la cantidad de pisos del edificio: ");
        int cantidadPisos = sc.nextInt();

        sistemaControl sistema = new sistemaControl(cantidadPisos);
        Ascensor ascensor = sistema.getAscensor();

        boolean dentro = false;
        boolean fallasActivadas = false;

        while (true) {
            
            System.out.println("\n--- MENU ---");
            System.out.println("Piso actual: " + ascensor.getPisoActual());
            System.out.println("Puerta abierta: " + ascensor.puerta().getAbierta());
            System.out.println("Estado: " + ascensor.getEstado());
            if (!dentro) {
                System.out.println("1. Llamar ascensor desde un piso");
                System.out.println("2. Entrar al ascensor (si puerta abierta)");
                System.out.println("3. Activar/desactivar fallas de botones");
                System.out.println("4. Salir");
                System.out.print("Opción: ");
                int op = sc.nextInt();
                switch (op) {
                    case 1:
                    System.out.print("¿Desde qué piso llama? ");
                    int pisoLlamada = sc.nextInt();
                    System.out.println("1=Subir 2=Bajar : ");
                    int dd = sc.nextInt();
                    
                    Direction dir = (dd == 1) ? Direction.UP : Direction.DOWN;
                    // simular falla de botón si está activada
                    if (fallasActivadas && rnd.nextInt(100) < 40) {
                        System.out.println(" Fallo: el botón no respondió. jaja");
                    } else {
                        sistema.registrarSolicitudPiso(pisoLlamada, dir);
                    }
                    break;

                    case 2:
                    if (ascensor.puerta().getAbierta()) {
                        dentro = true;
                        System.out.println("Entraste al ascensor.");
                    } else {
                        System.out.println("La puerta está cerrada. No puedes entrar. obvio");
                    }
                    break;

                    case 3:
                    System.out.println("1=Activar fallas | 0=Desactivar");
                    int f = sc.nextInt();
                    fallasActivadas = (f == 1);
                    System.out.println("Fallas " + (fallasActivadas ? "activadas" : "desactivadas"));
                    break;

                    case 4:
                    System.out.println("Saliendo... ):");
                    sc.close();
                    return;
                    
                    default:
                    System.out.println("Opción inválida. por que toqueteas?");
                }
            
            } else {
                // dentro del ascensor
                System.out.println("1. Seleccionar piso destino");
                System.out.println("2. Abrir puertas");
                System.out.println("3. Cerrar puertas");
                System.out.println("4. Emergencia");
                System.out.println("5. Salir del ascensor");
                System.out.println("6. Retirar obstaculo de la puerta");
                System.out.print("Opción: ");
                int op = sc.nextInt();
                
                switch (op) {
                    case 1:
                    System.out.print("Ingrese piso destino: ");
                    int destino = sc.nextInt();
                    // simular falla
                    if (fallasActivadas && rnd.nextInt(100) < 40) {
                        System.out.println(" Fallo: el botón no respondió. jeje ");
                        break;
                    }
                    // asignar destino 
                    boolean ok = ascensor.asignarDestino(destino);
                    if (ok) {
                        // mover automáticamente hasta destino 
                        // el control del movimiento lo hace ascensor.mover() repetidamente aquí)
                        while (ascensor.getPisoDestino() != -1 && ascensor.getEstado() != estadoAscensor.EMERGENCIA) {
                        // si durante el viaje hay un obstáculo, la puerta abrirá en mover()
                        ascensor.mover();
                    }
                }
                break;
                
                case 2:
                ascensor.presionarAbrir();
                break;
                
                case 3:
                ascensor.presionarCerrar();
                break;
                
                case 4:
                ascensor.presionarEmergencia();
                break;

                case 5:
                if (ascensor.puerta().getAbierta()) {
                    dentro = false;
                    System.out.println("Saliste del ascensor.");
                } else {
                    System.out.println("No puedes salir con la puerta cerrada. tontolio");
                }
                break;
                case 6:
                ascensor.puerta().setObstaculo(false);
                break;
                
                default:
                System.out.println("Opción inválida. que no toquetes");
            }
        }
    }
}

}
