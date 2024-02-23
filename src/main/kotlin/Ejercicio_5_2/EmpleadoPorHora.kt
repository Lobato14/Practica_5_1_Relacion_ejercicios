package Ejercicio_5_2

/**
 * Clase que representa a un empleado que recibe salario por hora trabajada.
 * @param nombre El nombre del empleado.
 * @param id El identificador único del empleado.
 * @property horasTrabajadas La cantidad de horas trabajadas por el empleado en el mes.
 * @property tarifaPorHora La tarifa por hora pagada al empleado.
 */
class EmpleadoPorHora(nombre: String, id: String, val horasTrabajadas: Int,
                      val tarifaPorHora: Double) : Empleado(nombre, id) {

    override fun calculaSalario(): Double {
        return horasTrabajadas * tarifaPorHora
    }
}