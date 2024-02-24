package Ejercicio_5_7


open class Vehiculo(var marca:String, var modelo:String, var capacidadCombustible:Int) {

    open fun mostrarInformacion() {
        println("Marca: $marca, modelo: $modelo, capacidad de " +
                "combustible: $capacidadCombustible litros")
    }

    open fun calcularAutonomia(): Int {
        return capacidadCombustible * 10
    }
}