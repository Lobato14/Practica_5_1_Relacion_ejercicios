package Ejercicio_5_3

interface Vehiculo {
    var motorEncendido: Boolean
    var kmHora: Int
    fun acelerar(velocidad: Int)
    fun frenar(velocidad: Int)
}