package Ejercicio_5_8

import java.time.LocalDate

/**
 * Clase que representa a un estudiante, hereda de Persona y añade una propiedad carrera.
 * @property carrera La carrera que estudia el estudiante.
 * @constructor Crea una nueva instancia de Estudiante con el nombre, fecha de nacimiento
 * y carrera especificados.
 */
class Estudiante(nombre: String, fechaNacimiento: LocalDate, var carrera: String)
    : Persona(nombre, fechaNacimiento) {
    /**
     * Sobrescritura del método toString para obtener una representación de cadena del
     * estudiante.
     * @return Una cadena que representa al estudiante con su nombre, edad y carrera.
     */
    override fun toString(): String {
        return "${super.toString()}, carrera = $carrera"
    }
    /**
     * Sobrescritura del método actividad para mostrar la actividad específica de un
     * estudiante.
     */
    override fun actividad() {
        println("$nombre está estudiando $carrera.")
    }
}