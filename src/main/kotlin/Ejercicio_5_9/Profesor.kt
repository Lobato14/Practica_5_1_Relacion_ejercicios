package Ejercicio_5_9

class Profesor(nombre: String, edad: Int, id: String, val departamento: String,
               val aniosExperiencia: Int) : Persona(nombre, edad, id) {

    override fun mostrarRol() {
        println("Rol: Profesor")
    }

    fun mostrarExperiencia() {
        println("Años de Experiencia: $aniosExperiencia")
    }
}