package Ejercicio_5_7

/*
    Descripción: Crea una jerarquía de clases para representar diferentes tipos de
    vehículos. Cada vehículo tiene características comunes como la marca, el modelo
    y la capacidad de combustible, pero cada tipo tiene sus propias características
    y comportamientos.

    Clases a implementar:

    1. Clase Base Vehiculo

    2. Propiedades comunes: marca (String), modelo (String), capacidadCombustible (Int).

    3. Método mostrarInformacion(), que imprime la información del vehículo.

    4. Método calcularAutonomia(), que retorna un valor Int (Suponemos que cada litro da
    para 10 km).

    5. Clase Derivada Automovil (hereda de Vehiculo)

    6. Propiedad específica: tipo (String), como "sedán", "SUV", "deportivo", etc.

    7. Implementa el método calcularAutonomia() (Suponemos que un automóvil puede hacer
    100km más que el cálculo realizado en su clase base)

    8. Clase Derivada Motocicleta (hereda de Vehiculo)

    9. Propiedad específica: cilindrada (Int).

    10. Implementa el método calcularAutonomia() (Suponemos que una moto puede hacer 40km
    menos que el cálculo realizado en su clase base)

    Objetivo: Demostrar cómo se pueden crear clases derivadas de una superclase y cómo
    pueden extender o modificar su comportamiento.

 */

fun main() {

    val automovil = Automovil("Toyota", "Corolla", 50,
        "sedán")
    println("Información del automóvil:")
    automovil.mostrarInformacion()
    println("Autonomía del automóvil: ${automovil.calcularAutonomia()} km")
    println()

    val motocicleta = Motocicleta("Honda", "CBR600RR",
        20, 600)
    println("Información de la motocicleta:")
    motocicleta.mostrarInformacion()
    println("Autonomía de la motocicleta: ${motocicleta.calcularAutonomia()} km")
}