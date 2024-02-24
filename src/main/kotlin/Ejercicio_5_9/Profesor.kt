package Ejercicio_5_9

/**
 * Clase derivada que representa a un profesor en un entorno académico.
 * @property departamento El departamento al que pertenece el profesor.
 * @property aniosExperiencia Los años de experiencia del profesor.
 * @constructor Crea una nueva instancia de Profesor con el nombre, edad, id,
 * departamento y años de experiencia especificados.
 */
class Profesor(nombre: String, edad: Int, id: String, val departamento: String,
               val aniosExperiencia: Int) : Persona(nombre, edad, id) {

    /**
     * Método que sobrescribe el método mostrarRol para imprimir el rol del profesor.
     */
    override fun mostrarRol() {
        println("Rol: Profesor")
    }

    /**
     * Método que muestra los años de experiencia del profesor.
     */
    fun mostrarExperiencia() {
        println("Años de Experiencia: $aniosExperiencia")
    }
}