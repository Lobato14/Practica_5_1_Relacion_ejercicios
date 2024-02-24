package Ejercicio_5_6

/**
 * Clase abierta que representa un artículo con nombre, precio y un ID generado
 * automáticamente.
 * @property nombre Nombre del artículo.
 * @property precio Precio del artículo.
 * @constructor Crea un nuevo artículo con el nombre y precio especificados.
 */
open class Articulo(var nombre: String, var precio: Double) {
    private val id = generarId()

    companion object {
        private var totalArticulos = 0

        /**
         * Función que genera un nuevo ID para un artículo.
         * @return El ID generado.
         */
        private fun generarId(): Int {
            totalArticulos++
            return totalArticulos
        }
    }

    /**
     * Función abierta que aplica un descuento al precio del artículo para una promoción
     * de Navidad.
     * @param porcentajeDescuento El porcentaje de descuento a aplicar.
     */
    open fun promocionNavidad(porcentajeDescuento: Double) {
        precio -= precio * (porcentajeDescuento / 100)
    }

    /**
     * Función que retorna una representación en formato String del artículo.
     * @return Una cadena que representa el artículo con el nombre, precio y ID.
     */
    override fun toString(): String {
        return "$nombre - %.2f€ (ID: $id)".format(precio)
    }
}