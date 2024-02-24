package Ejercicio_5_10

open class Persona(val nombre: String, var edad: Int) {
    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad"
    }

    open fun celebrarCumple(): String {
        edad++
        return "¡Feliz cumpleaños $nombre! Ahora tienes $edad años."
    }
}