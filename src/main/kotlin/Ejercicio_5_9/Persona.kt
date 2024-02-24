package Ejercicio_5_9

/**
 * Clase base que representa a una persona en un entorno académico.
 * @property nombre El nombre de la persona.
 * @property edad La edad de la persona.
 * @property id El identificador único de la persona.
 * @constructor Crea una nueva instancia de Persona con el nombre, edad y
 * id especificados.
 */
open class Persona(val nombre: String, val edad: Int, val id: String) {
    /**
     * Método abierto que muestra el rol de la persona.
     */
    open fun mostrarRol() {
        println("Rol: Persona")
    }
}