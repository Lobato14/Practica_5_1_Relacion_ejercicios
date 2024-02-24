package Ejercicio_5_10

/**
 * Clase derivada que representa a un gerente, hereda de Empleado.
 * @property bonus El bonus adicional del gerente.
 * @property exentoImpuestos Indica si el gerente está exento de impuestos (por defecto
 * es false).
 * @constructor Crea una nueva instancia de Gerente con el nombre, edad, salario base,
 * bonus y estado de exención de impuestos especificados.
 */
class Gerente(nombre: String, edad: Int, salarioBase: Double, var bonus: Double,
              var exentoImpuestos: Boolean = false) : Empleado(nombre, edad, salarioBase) {

    // Sobrescribe el porcentaje de impuestos para los gerentes
    override var porcentajeImpuestos: Double = 33.99

    /**
     * Método que calcula el salario del gerente teniendo en cuenta el bonus y la
     * exención de impuestos.
     * @return El salario neto del gerente.
     */
    override fun calcularSalario(): Double {
        val salarioSinImpuestos = salarioBase + bonus
        if (exentoImpuestos) {
            return salarioSinImpuestos
        } else{
            return super.calcularSalario()
        }
    }

    /**
     * Método que devuelve una cadena con la información del gerente, incluyendo su salario y bonus.
     * @return Una cadena con el nombre, edad, salario y bonus del gerente.
     */
    override fun toString(): String {
        val salario = String.format("%.2f", calcularSalario())
        return "${super.toString()}, Salario + Bonus: $salario€"
    }

    /**
     * Método que indica que el gerente está administrando la empresa.
     * @return Un mensaje indicando que el gerente está administrando la empresa.
     */
    fun administrar(): String {
        return "$nombre está administrando la empresa."
    }
}
