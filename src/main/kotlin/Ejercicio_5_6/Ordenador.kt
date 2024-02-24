package Ejercicio_5_6

/**
 * Clase que representa un ordenador, que es un tipo de artículo.
 * @property tipo El tipo de ordenador.
 * @constructor Crea un nuevo ordenador con el nombre, precio y tipo especificados.
 */
class Ordenador(nombre: String, precio: Double, var tipo: TipoOrdenador = TipoOrdenador.BASICO)
    : Articulo(nombre, precio) {
    /**
     * Función que aplica un descuento al precio del ordenador para una promoción
     * de Navidad si el precio es superior a 500 euros.
     * @param porcentajeDescuento El porcentaje de descuento a aplicar.
     */
    override fun promocionNavidad(porcentajeDescuento: Double) {
        if (precio > 500) {
            super.promocionNavidad(porcentajeDescuento)
        }
    }
}