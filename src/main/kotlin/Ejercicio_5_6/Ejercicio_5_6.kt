package Ejercicio_5_6

/*
    Ejercicio 6: Sistema de articulos

    Crear una clase Articulo con un nombre y un precio, que ambos se
    puedan modificar.

    También tendrá un id que se generará de forma automática mediante un contador
    (totalArticulos) y una función generarId(). Este id no podrá modificarse ni
    obtenerse fuera de Articulo.

    Crear un método promocionNavidad() que reciba el porcentaje de rebaja y lo aplique
    al precio.

    Sobreescribir el método toString() para que retorne el "{nombre} - {precio con dos
    decilames}€ (ID: {id})".

    Crear una clase que herede de Articulo y se llame Ordenador. Debe agregar a su
    constructor primario el tipo, que será de TipoOrdenador=> (BASICO, OFIMATICA,
    TODOTERRENO, GAMING) y por defecto será BASICO.

    Sobreescribe el método promocionNavidad() para que solo aplique la promoción si el
    precio es superior a 500 euros.

    En el main crea dos artículos con precios 25 y 45 euros. También crea dos ordenadores,
    el primero GAMING de precio 1299.99 y el segundo un ordenador básico de 399.99 euros.

    Crear una variable para generar una lista con ellos y recorrerla aplicándoles la
    promoción e imprimiendo su contenido.

    Puedes declarar la variable de la siguiente forma:

    // Lista de todos los artículos
    val articulos = listOf(articulo1, articulo2, ordenador1, ordenador2)

    Responde a las siguientes preguntas:

    1. ¿De qué tipo genera en la lista por defecto el compilador?

    Por defecto el compilador genera la lista con el tipo común más cercano entre
    los elementos que se están agregando a la lista. Por defecto usa el de la clase
    Articulo.

    2. ¿Qué está ocurriendo en este ejemplo con respecto a lo que hemos visto del
    polimorfismo de la herencia?

    Pues que en la lista de artículos puede contener tanto objetos de la clase base
    Articulo como de la clase derivada Ordenador. A la de que se recorra la lista y
    llamar al método promocionNavidad(), se está invocando de forma polimórfica el
    método correspondiente para cada objeto. Es decir, se ejecutará el método adecuado
    según el tipo real de cada elemento en tiempo de ejecución.

    3. ¿Qué pasaría si creáramos la lista con listOf<Ordenador>? ¿Y si la hiciéramos
    con listOf<Any>?

    Que se está restringiendo la lista para aquellos objetos que solo sean de tipo
    Ordenador. Se permitiría que dicha lista contenga cualquier tipo de objeto, sin ninguna
    restricción.
 */

fun main(){

    val articulo1 = Articulo("Artículo 1", 25.00)
    val articulo2 = Articulo("Artículo 2", 45.00)
    val ordenador1 = Ordenador("Ordenador Gaming", 1299.99,
            TipoOrdenador.GAMING)
    val ordenador2 = Ordenador("Ordenador Básico", 399.99)

    val articulos = listOf(articulo1, articulo2, ordenador1, ordenador2)

    for (articulo in articulos) {
        articulo.promocionNavidad(10.0)
        println(articulo)
    }
}