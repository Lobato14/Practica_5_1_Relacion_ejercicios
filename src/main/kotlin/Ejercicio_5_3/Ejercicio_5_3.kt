package Ejercicio_5_3

// Ejercicio 3: Sistema de Dispositivos Electrónicos

/*
    Crea tres interfaces:

    - EncendidoApagado con métodos como encender() y apagar().
    - DispositivoElectronico con un método llamado reiniciar().
    - Vehiculo con dos propiedades: motorEncendido y kmHora; y
      los métodos acelerar(Int) y frenar(Int).

    Implementa estas interfaces en varias clases como Telefono, Lavadora y Coche. Cada
    clase debería tener su propia implementación de los métodos de las interfaces que
    tengan sentido que implementen, simulando el comportamiento que le obligan a
    desarrollar a cada una.

    Un coche solo acelera y frena si tiene el motor encendido. Por defecto un objeto
    coche estará apagado. Si a un coche le mandamos frenar y su valor final fuera negativo
    le asignaremos a kmHora el valor 0.
 */

fun main() {

    val telefono = Telefono()
    telefono.encender()
    telefono.reiniciar()
    telefono.apagar()

    val lavadora = Lavadora()
    lavadora.encender()
    lavadora.reiniciar()
    lavadora.apagar()

    val coche = Coche()
    coche.acelerar(50)
    coche.motorEncendido = true
    coche.acelerar(50)
    coche.frenar(30)
    coche.frenar(100)
    println("Velocidad del coche: ${coche.kmHora} km/h")
}