package edu.etec.ds.fundamentos

fun sumarHasta(n: Int): Int {
    var suma = 0
    for (i in 1..n) {
        suma += i
    }
    return suma
    TODO("Sumar todos los numeros desde 1 hasta n (inclusive)")
}

fun contarPares(inicio: Int, fin: Int): Int {
    var contador = 0
    for (i in inicio..fin) {
        if (i % 2 == 0)
            contador += 1
    }
    return contador
}

fun fibonacci(n: Int): Int {
    TODO("Retornar el n-esimo numero de Fibonacci")
}

fun factorial(n: Int): Int {
    TODO("Calcular el factorial de n")
}

fun encontrarMaximo(numeros: List<Int>): Int {
    TODO("Encontrar el valor maximo en la lista")
}

fun encontrarMinimo(numeros: List<Int>): Int {
    TODO("Encontrar el valor minimo en la lista")
}

fun sumarLista(numeros: List<Int>): Int {
    TODO("Sumar todos los elementos de la lista")
}

fun inverter(texto: String): String {
    TODO("Invertir la cadena de texto")
}

fun contarVocales(texto: String): Int {
    TODO("Contar las vocales en el texto (considerar mayusculas y minusculas)")
}

fun esPalindromo(texto: String): Boolean {
    TODO("Verificar si el texto es un palindromo (ignorando espacios)")
}

fun tablaMultiplicar(numero: Int): List<Int> {
    TODO("Retornar lista con la tabla de multiplicar del 1 al 10")
}
