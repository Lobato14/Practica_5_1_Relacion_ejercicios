package Ejercicio_5_2

// Ejercicio 2: Sistema de Empleados y Departamentos

/*
    Diseña una clase abstracta Empleado con propiedades como nombre, id,
    y un método abstracto calculaSalario(). Crea clases derivadas como
    EmpleadoPorHora y EmpleadoFijo, que implementen el método calculaSalario()
    de diferentes maneras. Considera añadir una clase Departamento que tenga una
    lista de empleados y pueda calcular el salario total que se debe pagar a todos
    sus empleados.

    EmpleadoPorHora podría implementar dos propiedades cómo horasTrabajadas al mes y
    tarifaPorHora para realizar el cálculo de su salario mensual. EmpleadoFijo podría
    tener a su vez dos propiedades distintas, salarioFijo y numPagas del que podríamos
    calcular su salario mensual

    Departamento podría tener una lista de empleados y dos métodos: agregarEmpleado y
    calculaSalarioTotal que tienen sus empleados al mes.

    En el main crea una instancia de Departamento, agrega varios empleados, recorre
    la lista de los empleados mostrando su información "Nombre con ID-0001 tiene un
    salario de 28697.96 al mes." (el id siempre con 4 posiciones numéricas y el salario
    con 2 decimales)
 */

import java.text.DecimalFormat

fun main() {
    // Con DecimalFormat realizamos el formato decimal que va a tener
    val formatoSalario = DecimalFormat("0.00")
    val departamento = Departamento()

    // Agregamos empleados al departamento
    departamento.agregarEmpleado(EmpleadoPorHora("Juan", "BNH4",
        160, 25.0))
    departamento.agregarEmpleado(EmpleadoFijo("Maria", "BNH5",
        30000.0, 12))

    for (empleado in departamento.empleados) {
        println("${empleado.nombre} con ID-${empleado.id} tiene un salario " +
                "de ${formatoSalario.format(empleado.calculaSalario())} al mes.")
    }

    // Calculamos el salario total del departamento
    println("El salario total del departamento es: " +
            "${formatoSalario.format(departamento.calculaSalarioTotal())} al mes.")
}