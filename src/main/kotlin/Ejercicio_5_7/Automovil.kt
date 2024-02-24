package Ejercicio_5_7

/**
 * Clase que representa un automóvil, que es un tipo de vehículo.
 * @property tipo El tipo de automóvil, como "sedán", "SUV", "deportivo", etc.
 * @constructor Crea un nuevo automóvil con la marca, modelo, capacidad de combustible
 * y tipo especificados.
 */
class Automovil(marca: String, modelo: String, capacidadCombustible: Int, var tipo: String)
    : Vehiculo(marca, modelo, capacidadCombustible) {
    /**
     * Función que sobrescribe el método para calcular la autonomía del automóvil.
     * @return La autonomía del automóvil en kilómetros.
     */
    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia() + 100
    }
}