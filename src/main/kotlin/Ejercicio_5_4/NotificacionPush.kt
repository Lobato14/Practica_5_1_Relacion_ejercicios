package Ejercicio_5_4

/**
 * Clase que representa una notificación enviada mediante notificación push.
 */
class NotificacionPush:Notificable {
    /**
     * Función que envía una notificación push.
     */
    override fun enviarNotificacion() {
        println("Enviando notificación push...")
        println("Notificación push enviada.")
    }
}