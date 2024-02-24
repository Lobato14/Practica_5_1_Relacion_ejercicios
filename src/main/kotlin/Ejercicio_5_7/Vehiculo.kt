package Ejercicio_5_7

/**
 * Clase base que representa un vehículo con características comunes como marca,
 * modelo y capacidad de combustible.
 * @property marca La marca del vehículo.
 * @property modelo El modelo del vehículo.
 * @property capacidadCombustible La capacidad de combustible del vehículo en litros.
 * @constructor Crea un nuevo vehículo con la marca, modelo y capacidad de combustible
 * especificados.
 */
open class Vehiculo(var marca:String, var modelo:String, var capacidadCombustible:Int) {
    /**
     * Función abierta que muestra la información del vehículo, incluyendo marca, modelo y
     * capacidad de combustible.
     */
    open fun mostrarInformacion() {
        println("Marca: $marca, modelo: $modelo, capacidad de " +
                "combustible: $capacidadCombustible litros")
    }
    /**
     * Función abierta que calcula la autonomía del vehículo basándose en la capacidad de
     * combustible.
     * @return La autonomía del vehículo en kilómetros.
     */
    open fun calcularAutonomia(): Int {
        return capacidadCombustible * 10
    }
}