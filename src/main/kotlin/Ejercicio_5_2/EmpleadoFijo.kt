package Ejercicio_5_2

class EmpleadoFijo(nombre: String, id: String, val salarioFijo: Double, val numPagas: Int) :
    Empleado(nombre, id) {

    override fun calculaSalario(): Double {
        return salarioFijo / numPagas
    }
}