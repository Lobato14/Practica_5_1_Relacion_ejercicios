package Ejercicio_5_4

/**
 * Clase que representa una notificación enviada por mensaje de texto.
 */
class MensajeTexto:Notificable {
    /**
     * Función que envía una notificación por mensaje de texto.
     */
    override fun enviarNotificacion() {
        println("Enviando notificación por mensaje de texto...")
        println("Notificación por mensaje de texto enviada.")
    }
}