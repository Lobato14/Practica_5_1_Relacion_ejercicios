package Ejercicio_5_10

/**
 * Clase derivada que representa a un empleado.
 * @property salarioBase El salario base del empleado.
 * @property porcentajeImpuestos El porcentaje de impuestos aplicado al salario base
 * (por defecto es 10.0%).
 * @constructor Crea una nueva instancia de Empleado con el nombre, edad, salario base
 * y porcentaje de impuestos especificados.
 */
open class Empleado(nombre: String, edad: Int, var salarioBase: Double,
                    open var porcentajeImpuestos: Double = 10.0) : Persona(nombre, edad) {
    /**
     * Método abierto que calcula el salario del empleado después de aplicar los
     * impuestos.
     * @return El salario neto del empleado.
     */
    open fun calcularSalario(): Double {
        val impuestos = salarioBase * (porcentajeImpuestos / 100)
        return salarioBase - impuestos
    }
    /**
     * Método que devuelve una cadena con la información del empleado, incluyendo su
     * salario.
     * @return Una cadena con el nombre, edad y salario del empleado.
     */
    override fun toString(): String {
        val salario = String.format("%.2f", calcularSalario())
        return "${super.toString()}, Salario: $salario€"
    }
    /**
     * Método abierto que indica que el empleado está trabajando.
     * @return Un mensaje indicando que el empleado está trabajando.
     */
    open fun trabajar(): String {
        return "$nombre está trabajando en la empresa."
    }
}