package Ejercicio_5_9

/*
    Ejercicio 9: Sistema de Gestión Académica

    Descripción: Crea una jerarquía de clases para representar distintos roles en un
    entorno académico, como estudiantes y profesores.

    Clases a implementar:

    1. Clase Base Persona

    2. Propiedades comunes: nombre (String), edad (Int), id (String).

    3. Método mostrarRol(), que imprime el rol de la persona (Estudiante, Profesor, etc.).

    4. Clase Derivada Estudiante

    5. Propiedades específicas: curso (String), calificacionPromedio (Double).

    6. Implementa el método mostrarRol() y añade un método mostrarCalificacion() para
    imprimir la calificación promedio.

    7. Clase Derivada Profesor

    8. Propiedades específicas: departamento (String), aniosExperiencia (Int).

    9. Implementa el método mostrarRol() y añade un método mostrarExperiencia() para
    imprimir los años de experiencia.
 */

fun main() {
    // Creamos un estudiante y mostramos su información
    val estudiante = Estudiante("Juan", 20, "E001",
        "Ingeniería Informática", 8.5)
    estudiante.mostrarRol()
    estudiante.mostrarCalificacion()
    println()

    // Creamos un profesor y mostramos su información
    val profesor = Profesor("María", 35, "P001",
        "Matemáticas", 15)
    profesor.mostrarRol()
    profesor.mostrarExperiencia()
}