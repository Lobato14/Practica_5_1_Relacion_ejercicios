package Ejercicio_5_4

// Ejercicio 4: Sistema de Notificación

/*
    Diseña una interfaz Notificable con un método enviarNotificacion(). Implementa esta
    interfaz en clases como CorreoElectronico, MensajeTexto, y NotificacionPush.
    Cada clase debe tener una implementación específica de enviarNotificacion(),
    simula el envío de la notificación a través del canal apropiado.

    En el programa principal crea una lista de tipo Notificable llamada notificaciones y
    en ella crea un objeto de cada clase. Recorre la lista enviando una notificación con
    cada elemento.
 */

fun main() {
    val notificaciones = listOf(CorrreoElectronico(), MensajeTexto(), NotificacionPush())
    // Enviamos las notificaciones
    for (notificacion in notificaciones) {
        notificacion.enviarNotificacion()
        println()
    }
}