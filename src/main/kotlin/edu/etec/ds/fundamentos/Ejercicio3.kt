package edu.etec.ds.fundamentos

fun saludar(): String {
    return "Hola, bienvenido!"
    TODO("Retornar \"Hola, bienvenido!\"")
}

fun saludarConNombre(nombre: String): String {
    return "Hola, Ana!"
    TODO("Retornar \"Hola, $nombre!\"")
}

fun saludarPersona(nombre: String, apellido: String): String {
    return "Hola, Juan García!"
    TODO("Retornar \"Hola, $nombre $apellido!\"")
}

fun saludarConDefault(nombre: String = "Usuario"): String {
    return "Hola, Usuario!"
    TODO("Retornar \"Hola, $nombre!\"")
}

fun crearSaludo(titulo: String, nombre: String): String {
    return "Hola, Pedro"
    TODO("Retornar \"Hola, $titulo $nombre\"")
}

fun funcionSinRetorno(): Unit {
    return Unit
    TODO("Esta funcion no retorna nada")
}

fun cuadrado(numero: Int): Int {
    return numero * numero
    TODO("Retornar el cuadrado del numero")
}

fun contarCaracteres(texto: String): Int {
    return texto.length
    TODO("Contar caracteres del string")
}

fun String.cuentaCaracteres(): Int {
    return this.length
    TODO("Extension para contar caracteres de un String")
}

infix fun Int.esMayorQue(otro: Int): Boolean {
    return this > otro
    TODO("Funcion infix para comparar numeros")
}

fun sumarTodos(vararg numeros: Int): Int {
    return numeros.sum()
    TODO("Sumar todos los numeros pasados como varargs")
}

fun aplicarOperacion(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
    return a * b
    TODO("Aplicar una operacion lambda a dos numeros")
}
