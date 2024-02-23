package Ejercicio_5_2

/**
 * Clase abstracta que define la estructura básica de un empleado.
 * @property nombre El nombre del empleado.
 * @property id El identificador único del empleado.
 */
abstract class Empleado(var nombre:String, var id:String) {
    /**
     * Método abstracto que debe ser implementado por las clases derivadas para calcular
     * el salario del empleado.
     * @return El salario del empleado.
     */
    abstract fun calculaSalario():Double
}