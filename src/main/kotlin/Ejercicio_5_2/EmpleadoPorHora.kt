package Ejercicio_5_2

class EmpleadoPorHora(nombre: String, id: String, val horasTrabajadas: Int,
                      val tarifaPorHora: Double) : Empleado(nombre, id) {

    override fun calculaSalario(): Double {
        return horasTrabajadas * tarifaPorHora
    }
}