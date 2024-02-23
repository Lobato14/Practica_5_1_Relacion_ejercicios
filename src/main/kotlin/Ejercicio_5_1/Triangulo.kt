package Ejercicio_5_1

/**
 * Clase que representa un triángulo.
 * @property base La longitud de la base del triángulo.
 * @property altura La altura del triángulo.
 * @property lado1 La longitud de un lado del triángulo.
 * @property lado2 La longitud del otro lado del triángulo.
 * @constructor Crea un triángulo con las longitudes de base, altura y lados especificadas.
 */
class Triangulo(color: String, val base: Double, val altura: Double, val lado1: Double,
                val lado2: Double) : Figura(color) {

    override fun area(): Double {
        return 0.5 * base * altura
    }

    override fun perimetro(): Double {
        return base + lado1 + lado2
    }
}