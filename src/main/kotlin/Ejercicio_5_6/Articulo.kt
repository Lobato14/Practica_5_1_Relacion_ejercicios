package Ejercicio_5_6

open class Articulo(var nombre: String, var precio: Double) {
    private val id = generarId()

    companion object {
        private var totalArticulos = 0

        private fun generarId(): Int {
            totalArticulos++
            return totalArticulos
        }
    }

    open fun promocionNavidad(porcentajeDescuento: Double) {
        precio -= precio * (porcentajeDescuento / 100)
    }

    override fun toString(): String {
        return "$nombre - %.2f€ (ID: $id)".format(precio)
    }
}