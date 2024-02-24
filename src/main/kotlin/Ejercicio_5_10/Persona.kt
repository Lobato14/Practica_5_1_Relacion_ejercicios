package Ejercicio_5_10

/**
 * Clase base que representa a una persona.
 * @property nombre El nombre de la persona.
 * @property edad La edad de la persona.
 * @constructor Crea una nueva instancia de Persona con el nombre y edad especificados.
 */
open class Persona(val nombre: String, var edad: Int) {
    /**
     * Método que devuelve una cadena con información básica sobre la persona.
     * @return Una cadena con el nombre y la edad de la persona.
     */
    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad"
    }
    /**
     * Método abierto que incrementa la edad de la persona en 1 y retorna un mensaje de
     * felicitación.
     * @return Un mensaje de felicitación por el cumpleaños de la persona.
     */
    open fun celebrarCumple(): String {
        edad++
        return "¡Feliz cumpleaños $nombre! Ahora tienes $edad años."
    }
}