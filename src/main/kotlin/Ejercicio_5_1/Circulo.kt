package Ejercicio_5_1

import kotlin.math.PI

/**
 * Clase que representa un círculo.
 * @property radio El radio del círculo.
 * @constructor Crea un círculo con el radio especificado.
 */

class Circulo(color:String, private var radio:Double):Figura(color) {
    override fun area():Double{
        return PI * radio * radio
    }
    override fun perimetro(): Double {
        return 2 * PI * radio
    }
}