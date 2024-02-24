package Ejercicio_5_7

class Motocicleta(marca: String, modelo: String, capacidadCombustible: Int, var cilindrada: Int)
                  : Vehiculo(marca, modelo, capacidadCombustible) {

    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia() - 40
    }
}