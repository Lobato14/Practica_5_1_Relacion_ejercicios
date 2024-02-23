package Ejercicio_5_1

/**
 * Clase abstracta que representa una figura geométrica.
 * @property color El color de la figura.
 */
abstract class Figura(var color: String) {
    /**
     * Función que calcula el área de la figura.
     * @return El área de la figura.
     */
    abstract fun area():Double
    /**
     * Función que calcula el perímetro de la figura.
     * @return El perímetro de la figura.
     */
    abstract fun perimetro():Double
}