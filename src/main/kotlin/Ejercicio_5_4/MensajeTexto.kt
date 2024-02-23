package Ejercicio_5_4

class MensajeTexto:Notificable {
    override fun enviarNotificacion() {
        println("Enviando notificación por mensaje de texto...")
        println("Notificación por mensaje de texto enviada.")
    }
}