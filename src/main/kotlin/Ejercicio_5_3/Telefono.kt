package Ejercicio_5_3

/**
 * Clase que representa un teléfono.
 */
class Telefono : EncendidoApagado, DispositivoElectronico {
    var encendido = false

    override fun encender() {
        println("Encendiendo teléfono")
        encendido = true
    }

    override fun apagar() {
        println("Apagando teléfono")
        encendido = false
    }

    override fun reiniciar() {
        println("Reiniciando teléfono")
    }
}