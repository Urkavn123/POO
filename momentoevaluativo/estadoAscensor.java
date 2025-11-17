/**
 * Enum EstadoAscensor representa el estado actual del ascensor dentro del sistema.
 * MOVIENDO:  el ascensor está en desplazamiento activo entre pisos.
 * DETENIDO:  el ascensor está inmóvil, ya sea esperando solicitudes o con puertas abiertas.
 * EMERGENCIA: el ascensor ha sufrido una falla o se activó la alarma, deteniéndose inmediatamente y abriendo puertas por seguridad.
 */

public enum estadoAscensor {
    MOVIENDO,
    DETENIDO,
    PUERTAS_ABIERTAS,
    EMERGENCIA

}

