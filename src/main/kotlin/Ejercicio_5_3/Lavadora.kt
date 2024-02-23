package Ejercicio_5_3

/**
 * Clase que representa una lavadora.
 */
class Lavadora : EncendidoApagado, DispositivoElectronico {
    var encendida = false

    override fun encender() {
        println("Encendiendo lavadora")
        encendida = true
    }

    override fun apagar() {
        println("Apagando lavadora")
        encendida = false
    }

    override fun reiniciar() {
        println("Reiniciando lavadora")
    }
}