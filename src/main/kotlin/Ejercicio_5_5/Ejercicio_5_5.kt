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


fun puedeTomarPrestado(usuario: Usuario, libro: Libro): String {
    return when (usuario) {
        is Usuario.Visitante -> "Los visitantes no pueden tomar prestados libros."
        is Usuario.Estudiante -> "El estudiante ${usuario.nombre} puede tomar prestado" +
                " el libro '${libro.titulo}'."
        is Usuario.Profesor -> "El profesor ${usuario.nombre} puede tomar prestado el " +
                "libro '${libro.titulo}' por más tiempo."
    }
}

fun main() {
    val estudiante = Usuario.Estudiante("123", "Juan", "Ingeniería")
    val profesor = Usuario.Profesor("456", "María", "Ciencias")
    val visitante = Usuario.Visitante("789", "Pedro")

    val libro = Libro("La Sombra del Viento", "Carlos Ruiz Zafón",
        2001)

    println(puedeTomarPrestado(estudiante, libro))
    println(puedeTomarPrestado(profesor, libro))
    println(puedeTomarPrestado(visitante, libro))
}

