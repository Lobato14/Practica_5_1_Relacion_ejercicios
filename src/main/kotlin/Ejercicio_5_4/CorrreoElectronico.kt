package Ejercicio_5_4

/**
 * Clase que representa una notificación enviada por correo electrónico.
 */
class CorrreoElectronico:Notificable {
    /**
     * Función que envía una notificación por correo electrónico.
     */
    override fun enviarNotificacion() {
        println("Enviando notificación por correo electrónico...")
        println("Notificación por correo electrónico enviada.")
    }
}