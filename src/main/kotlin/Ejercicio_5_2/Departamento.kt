package Ejercicio_5_2

class Departamento {
    val empleados = mutableListOf<Empleado>()

    fun agregarEmpleado(empleado: Empleado) {
        empleados.add(empleado)
    }

    fun calculaSalarioTotal(): Double {
        var salarioTotal = 0.0
        for (empleado in empleados) {
            salarioTotal += empleado.calculaSalario()
        }
        return salarioTotal
    }
}