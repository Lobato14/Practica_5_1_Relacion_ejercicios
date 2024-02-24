package Ejercicio_5_7

class Automovil(marca: String, modelo: String, capacidadCombustible: Int, var tipo: String)
    : Vehiculo(marca, modelo, capacidadCombustible) {

    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia() + 100
    }
}