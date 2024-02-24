package Ejercicio_5_10

class Gerente(nombre: String, edad: Int, salarioBase: Double, var bonus: Double,
              var exentoImpuestos: Boolean = false) : Empleado(nombre, edad, salarioBase) {

    override var porcentajeImpuestos: Double = 33.99

    override fun calcularSalario(): Double {
        val salarioSinImpuestos = salarioBase + bonus
        if (exentoImpuestos) {
            return salarioSinImpuestos
        } else{
            return super.calcularSalario()
        }
    }

    override fun toString(): String {
        val salario = String.format("%.2f", calcularSalario())
        return "${super.toString()}, Salario + Bonus: $salario€"
    }

    // Método para indicar que el gerente está administrando la empresa
    fun administrar(): String {
        return "$nombre está administrando la empresa."
    }
}
