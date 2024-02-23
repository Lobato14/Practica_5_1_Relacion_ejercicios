package Ejercicio_5_1

// Ejercicio 1: Sistema de Figuras Geométricas

/*
    Crea una clase abstracta Figura que tenga métodos abstractos para area()
    y perimetro(). Implementa subclases concretas como Circulo, Rectangulo,
    y Triangulo, proporcionando la implementación específica de estos métodos.
    La clase Figura podría tener propiedades comunes como el color, que se
    inicializarán a través del constructor.
 */

fun main() {
    val circulo = Circulo("Rojo", 5.0)
    println("Área del círculo: %.2f, Perímetro del círculo: %.2f".format(circulo.area(),
        circulo.perimetro()))

    val rectangulo = Rectangulo("Azul", 4.0, 6.0)
    println("Área del rectángulo: %.2f, Perímetro del rectángulo: %.2f".format(rectangulo.area(),
        rectangulo.perimetro()))

    val triangulo = Triangulo("Verde", 3.0, 4.0, 5.0, 5.0)
    println("Área del triángulo: %.2f, Perímetro del triángulo: %.2f".format(triangulo.area(),
        triangulo.perimetro()))
}