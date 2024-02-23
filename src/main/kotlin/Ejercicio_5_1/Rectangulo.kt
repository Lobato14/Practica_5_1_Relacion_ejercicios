package Ejercicio_5_1

/**
 * Clase que representa un rectángulo.
 * @property lado1 La longitud del primer lado del rectángulo.
 * @property lado2 La longitud del segundo lado del rectángulo.
 * @constructor Crea un rectángulo con las longitudes de lados especificadas.
 */
class Rectangulo(color: String, val lado1: Double, val lado2: Double) : Figura(color) {

    override fun area(): Double {
        return lado1 * lado2
    }

    override fun perimetro(): Double {
        return 2 * (lado1 + lado2)
    }
}