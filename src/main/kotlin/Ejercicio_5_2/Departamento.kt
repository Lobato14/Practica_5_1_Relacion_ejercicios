package Ejercicio_5_2

/**
 * Clase que representa un departamento que contiene una lista de empleados.
 */
class Departamento {
    val empleados = mutableListOf<Empleado>()

    /**
     * Función que agrega un empleado al departamento.
     * @param empleado El empleado a agregar.
     */
    fun agregarEmpleado(empleado: Empleado) {
        empleados.add(empleado)
    }
    /**
     * Función que calcula el salario total a pagar a todos los empleados del departamento.
     * @return El salario total del departamento.
     */
    fun calculaSalarioTotal(): Double {
        var salarioTotal = 0.0
        for (empleado in empleados) {
            salarioTotal += empleado.calculaSalario()
        }
        return salarioTotal
    }
}