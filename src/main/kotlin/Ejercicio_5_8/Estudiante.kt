package Ejercicio_5_8

import java.time.LocalDate

class Estudiante(nombre: String, fechaNacimiento: LocalDate, var carrera: String)
    : Persona(nombre, fechaNacimiento) {

    override fun toString(): String {
        return "${super.toString()}, carrera = $carrera"
    }

    override fun actividad() {
        println("$nombre está estudiando $carrera.")
    }
}