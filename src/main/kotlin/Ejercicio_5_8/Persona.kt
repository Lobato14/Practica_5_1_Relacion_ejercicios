package Ejercicio_5_8

import java.time.LocalDate

open class Persona(val nombre: String, fechaNacimiento: LocalDate) {
    private val fechaNacimiento: LocalDate = fechaNacimiento

    var edad = calcularEdad(fechaNacimiento)

    private fun calcularEdad(fechaNacimiento: LocalDate): Int {
        val fechaActual = LocalDate.now()
        return fechaActual.year - fechaNacimiento.year
    }

    fun cumple() {
        edad++
    }

    override fun toString(): String {
        return "Persona (nombre = $nombre, edad = $edad)"
    }

    open fun actividad() {
        println("$nombre está realizando una actividad.")
    }
}
