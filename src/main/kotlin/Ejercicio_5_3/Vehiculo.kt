package Ejercicio_5_3

/**
 * Interfaz que define el comportamiento de un vehículo.
 */
interface Vehiculo {
    var motorEncendido: Boolean
    var kmHora: Int
    /**
     * Método para acelerar el vehículo.
     * @param velocidad La cantidad de kilómetros por hora que se acelerará.
     */
    fun acelerar(velocidad: Int)
    /**
     * Método para frenar el vehículo.
     * @param velocidad La cantidad de kilómetros por hora que se frenará.
     */
    fun frenar(velocidad: Int)
}