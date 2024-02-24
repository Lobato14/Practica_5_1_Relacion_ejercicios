package Ejercicio_5_6

class Ordenador(nombre: String, precio: Double, var tipo: TipoOrdenador = TipoOrdenador.BASICO)
    : Articulo(nombre, precio) {

    override fun promocionNavidad(porcentajeDescuento: Double) {
        if (precio > 500) {
            super.promocionNavidad(porcentajeDescuento)
        }
    }
}