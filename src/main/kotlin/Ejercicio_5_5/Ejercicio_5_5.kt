package Ejercicio_5_5

// Ejercicio 5: Sistema de Gestión de Biblioteca

/*
    Imagina que estás construyendo un sistema para una biblioteca que gestiona libros
    y usuarios. Este sistema deberá poder manejar distintos tipos de items en la
    biblioteca (libros, revistas, DVDs) y distintos tipos de usuarios (estudiante,
    profesor, visitante).

    Parte 1: Definir data class

    1. Libro
    2. Título:String
    3. Autor:String
    4. Año de Publicación:Int
    5. Revista
    6. Título:String
    7. Issue:Int
    8. Año:Int
    9. DVD
    10. Título:String
    11. Director:String
    12. Año:Int

    Estas clases almacenarán la información básica de cada ítem en la biblioteca.
    Usa data class para definir estas clases, ya que son perfectas para almacenar
    datos sin necesidad de lógica adicional.

    Parte 2 Definir sealed class

    Para gestionar los distintos tipos de usuarios, puedes usar una sealed class.
    Esto te permitirá tener una jerarquía de clases cerrada, lo cual es útil para
    cuando se conocen todos los posibles subtipos.

    1. Usuario
    2. sealed class Usuario
        - Clases que heredan de Usuario:
        - Estudiante(id:String, nombre:String, carrera:String)
        - Profesor(id:String, nombre:String, departamento:String)
        - Visitante(id:String, nombre:String)

    La sealed class Usuario permitirá manejar operaciones específicas para
    cada tipo de usuario, como préstamos de libros o acceso a áreas restringidas
    de la biblioteca.
 */

/**
 * Función que verifica si un usuario puede tomar prestado un item de la biblioteca.
 * @param usuario El usuario que intenta tomar prestado el item.
 * @param item El item de la biblioteca que se quiere tomar prestado.
 * @return Un mensaje indicando si el usuario puede o no tomar prestado el item.
 */
fun puedeTomarPrestado(usuario: Usuario, item: Any): String {
    return when (usuario) {
        is Usuario.Visitante -> "Los visitantes no pueden tomar prestados items de la " +
                "biblioteca."
        is Usuario.Estudiante -> when (item) {
            is Libro -> "El estudiante ${usuario.nombre} puede tomar prestado el libro" +
                    " '${item.titulo}'."
            is Revista -> "El estudiante ${usuario.nombre} puede tomar prestada " +
                    "la revista '${item.titulo}'."
            is DVD -> "El estudiante ${usuario.nombre} puede tomar prestado el " +
                    "DVD '${item.titulo}'."
            else -> "Tipo de item no válido para estudiantes."
        }
        is Usuario.Profesor -> when (item) {
            is Libro -> "El profesor ${usuario.nombre} puede tomar prestado " +
                    "el libro '${item.titulo}' por más tiempo."
            is Revista -> "El profesor ${usuario.nombre} puede tomar prestada la revista" +
                    " '${item.titulo}' por más tiempo."
            is DVD -> "El profesor ${usuario.nombre} puede tomar prestado el DVD" +
                    " '${item.titulo}' por más tiempo."
            else -> "Tipo de item no válido para profesores."
        }
    }
}

fun main() {
    val estudiante = Usuario.Estudiante("123", "Juan", "Ingeniería")
    val profesor = Usuario.Profesor("456", "María", "Ciencias")
    val visitante = Usuario.Visitante("789", "Pedro")

    val libro = Libro("La Sombra del Viento", "Carlos Ruiz Zafón",
        2001)

    val revista = Revista("National Geographic", 123, 2022)
    val dvd = DVD("El Señor de los Anillos", "Peter Jackson", 2001)

    println(puedeTomarPrestado(estudiante, libro))
    println(puedeTomarPrestado(profesor, libro))
    println(puedeTomarPrestado(visitante, libro))
    println("--------------------------------------")
    println(puedeTomarPrestado(estudiante, revista))
    println(puedeTomarPrestado(profesor, revista))
    println(puedeTomarPrestado(visitante, revista))
    println("--------------------------------------")
    println(puedeTomarPrestado(estudiante, dvd))
    println(puedeTomarPrestado(profesor, dvd))
    println(puedeTomarPrestado(visitante, dvd))
}

