package Ejercicio_5_8

import java.time.LocalDate

/**
 * Clase abierta que representa a una persona con nombre, fecha de nacimiento y edad.
 * @property nombre El nombre de la persona.
 * @property fechaNacimiento La fecha de nacimiento de la persona.
 * @property edad La edad actual de la persona.
 * @constructor Crea una nueva instancia de Persona con el nombre y fecha de nacimiento especificados.
 */
open class Persona(val nombre: String, fechaNacimiento: LocalDate) {
    private val fechaNacimiento: LocalDate = fechaNacimiento

    var edad = calcularEdad(fechaNacimiento)
    /**
     * Método privado que calcula la edad de la persona a partir de su fecha de nacimiento.
     * @param fechaNacimiento La fecha de nacimiento de la persona.
     * @return La edad actual de la persona.
     */
    private fun calcularEdad(fechaNacimiento: LocalDate): Int {
        val fechaActual = LocalDate.now()
        return fechaActual.year - fechaNacimiento.year
    }
    /**
     * Método que incrementa la edad de la persona en un año.
     */
    fun cumple() {
        edad++
    }
    /**
     * Método de sobrescritura del método toString para obtener una representación de
     * cadena de la persona.
     * @return Una cadena que representa a la persona con su nombre y edad.
     */
    override fun toString(): String {
        return "Persona (nombre = $nombre, edad = $edad)"
    }
    /**
     * Método que representa la actividad genérica que realiza la persona.
     */
    open fun actividad() {
        println("$nombre está realizando una actividad.")
    }
}
