package Ejercicio_5_7

/**
 * Clase que representa una motocicleta, que es un tipo de vehículo.
 * @property cilindrada La cilindrada de la motocicleta.
 * @constructor Crea una nueva motocicleta con la marca, modelo, capacidad de
 * combustible y cilindrada especificadas.
 */
class Motocicleta(marca: String, modelo: String, capacidadCombustible: Int, var cilindrada: Int)
                  : Vehiculo(marca, modelo, capacidadCombustible) {
    /**
     * Función que sobrescribe el método para calcular la autonomía de la motocicleta.
     * @return La autonomía de la motocicleta en kilómetros.
     */
    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia() - 40
    }
}