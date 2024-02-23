package Ejercicio_5_3

/**
 * Clase que representa un coche.
 */
class Coche : Vehiculo {

    override var motorEncendido = true
    override var kmHora = 0

    override fun acelerar(velocidad: Int) {
        if (motorEncendido) {
            println("Acelerando el coche a $velocidad km/h")
            kmHora += velocidad
        } else {
            println("No se puede acelerar, el motor está apagado")
        }
    }

    override fun frenar(velocidad: Int) {
        if (motorEncendido) {
            println("Frenando el coche")
            kmHora -= velocidad
            if (kmHora < 0) {
                kmHora = 0
            }
        } else {
            println("No se puede frenar, el motor está apagado")
        }
    }
}