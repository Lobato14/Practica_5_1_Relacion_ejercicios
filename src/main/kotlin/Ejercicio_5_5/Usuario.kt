package Ejercicio_5_5

/**
 * Sealed class que define diferentes tipos de usuarios en la biblioteca.
 * @param id El identificador único del usuario.
 * @param nombre El nombre del usuario.
 */
sealed class Usuario(val id: String, val nombre: String) {
    /**
     * Clase que representa a un estudiante.
     * @param id El identificador único del estudiante.
     * @param nombre El nombre del estudiante.
     * @param carrera La carrera que estudia el estudiante.
     */
    class Estudiante(id: String, nombre: String, val carrera: String) : Usuario(id, nombre)
    /**
     * Clase que representa a un profesor.
     * @param id El identificador único del profesor.
     * @param nombre El nombre del profesor.
     * @param departamento El departamento al que pertenece el profesor.
     */
    class Profesor(id: String, nombre: String, val departamento: String) : Usuario(id, nombre)
    /**
     * Clase que representa a un visitante.
     * @param id El identificador único del visitante.
     * @param nombre El nombre del visitante.
     */
    class Visitante(id: String, nombre: String) : Usuario(id, nombre)
}