package Ejercicio_5_2

/**
 * Clase que representa a un empleado que recibe un salario fijo mensual.
 * @param nombre El nombre del empleado.
 * @param id El identificador único del empleado.
 * @property salarioFijo El salario fijo mensual del empleado.
 * @property numPagas El número de pagas en las que se distribuye el salario anual.
 */
class EmpleadoFijo(nombre: String, id: String, val salarioFijo: Double, val numPagas: Int) :
    Empleado(nombre, id) {

    override fun calculaSalario(): Double {
        return salarioFijo / numPagas
    }
}