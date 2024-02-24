package Ejercicio_5_9

/**
 * Clase derivada que representa a un estudiante en un entorno académico.
 * @property curso El curso en el que está inscrito el estudiante.
 * @property calificacionPromedio La calificación promedio del estudiante.
 * @constructor Crea una nueva instancia de Estudiante con el nombre, edad, id,
 * curso y calificación promedio especificados.
 */
class Estudiante(nombre: String, edad: Int, id: String, val curso: String,
                 val calificacionPromedio: Double) : Persona(nombre, edad, id) {

    /**
     * Función que sobrescribe el método mostrarRol para imprimir el rol del estudiante.
     */
    override fun mostrarRol() {
        println("Rol: Estudiante")
    }
    /**
     * Método que muestra la calificación promedio del estudiante.
     */
    fun mostrarCalificacion() {
        println("Calificación Promedio: $calificacionPromedio")
    }
}