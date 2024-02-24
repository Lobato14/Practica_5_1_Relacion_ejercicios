package Ejercicio_5_10

/*
    Ejercicio 10: Sistema de Gestión de Personal en una Empresa

    Requisitos:

    1. Clase Base Persona:

    2. Propiedades:
        - nombre (String)
        - edad (Int)

    3. Métodos:
        - toString(): Devuelve una cadena con información básica sobre la persona
        (por ejemplo, "Nombre: Julia, Edad: 24").

        - celebrarCumple(): Incrementa la edad en 1 y retorna un mensaje de felicitación
         (por ejemplo, "Feliz cumpleaños Julia! Ahora tienes 25 años.").

    4. Clase Derivada Empleado (de Persona):
    5. Propiedades:
        - salarioBase (Double) (Intenta permitir también que se pueda construir un
        empleado con un argumento Int en esta propiedad)

        - porcentajeImpuestos (Double) (Intenta permitir también que se pueda construir
         un empleado con un argumento Int en esta propiedad) (El valor por defecto es 10.0)

    6. Métodos:
        - calcularSalario(): Devuelve el salarioBase aplicando los impuestos.

        - toString(): Devuelve una cadena que incluye la información de Persona y
        detalles adicionales del Empleado (por ejemplo, "Nombre: Julia, Edad: 24,
        Salario: 28273.47€" con 2 posiciones decimales para el salario).

        - trabajar(): Retorna un mensaje que indica que el empleado está trabajando.
        (por ejemplo, "Pablo está trabajando en la empresa.")

    7. Clase Derivada Gerente (de Empleado):

    8. Propiedades:
        - bonus (Double)
        - exentoImpuestos (Boolean) (Por defecto no estará exento de los impuestos)

    9. Sobrescribir el porcentajeImpuestos para que los gerentes tengan un porcentaje de
    impuestos siempre del 33.99%.

    10. Métodos:
        - calcularSalario(): Devuelve el salarioBase más el bonus aplicando los impuestos
         solo al salario base o sin aplicar impuestos si exentoImpuestos es true.

        - toString(): Devuelve una cadena que incluye la información de Persona y Empleado,
         además de detalles específicos del Gerente.

        - administrar(): Retorna un mensaje que indica que el gerente está administrando.
        (por ejemplo, "Ana está administrando la empresa.")

    11. Uso en la Función main:

    Crear una persona, un empleado y un gerente. Realizar distintas pruebas... para cada
    uno mostrar su información y ejecutar los métodos que tienen accesibles.
 */

fun main() {
    // Creamos a una persona
    val persona = Persona("Juan", 30)
    println("Información de la Persona:")
    println(persona)
    println(persona.celebrarCumple())
    println()

    // Creamos a un empleado
    val empleado = Empleado("Ana", 25, 30000.00)
    println("Información del Empleado:")
    println(empleado)
    println(empleado.trabajar())
    println()

    // Creamos a un gerente
    val gerente = Gerente("Pedro", 40, 50000.0, 10000.00)
    println("Información del Gerente:")
    println(gerente)
    println(gerente.administrar())
}