package Ejercicio_5_10

open class Empleado(nombre: String, edad: Int, var salarioBase: Double,
                    open var porcentajeImpuestos: Double = 10.0) : Persona(nombre, edad) {

    open fun calcularSalario(): Double {
        val impuestos = salarioBase * (porcentajeImpuestos / 100)
        return salarioBase - impuestos
    }

    override fun toString(): String {
        val salario = String.format("%.2f", calcularSalario())
        return "${super.toString()}, Salario: $salario€"
    }

    open fun trabajar(): String {
        return "$nombre está trabajando en la empresa."
    }
}