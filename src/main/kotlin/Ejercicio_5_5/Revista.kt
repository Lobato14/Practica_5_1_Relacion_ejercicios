package Ejercicio_5_5

/**
 * Clase que representa una revista.
 * @property titulo El título de la revista.
 * @property issue El número de edición de la revista.
 * @property ano El año de publicación de la revista.
 */
data class Revista(
    val titulo: String,
    val issue: Int,
    val ano: Int
)