package Ejercicio_5_5

/**
 * Data class que representa la información básica de un libro.
 * @property titulo El título del libro.
 * @property autor El autor del libro.
 * @property anoPublicacion El año de publicación del libro.
 */
data class Libro(
    val titulo: String,
    val autor: String,
    val anoPublicacion: Int
)