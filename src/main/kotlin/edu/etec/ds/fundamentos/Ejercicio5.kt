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
    var nuevo = 0
    var viejo = 1
    for (i in 2..n) {
        val suma_f = nuevo + viejo
        nuevo = viejo
        viejo = suma_f
    }
    return viejo
    TODO("Retornar el n-esimo numero de Fibonacci")
}

fun factorial(n: Int): Int {
    var resultado = 1
    for (i in 1..n) {
        resultado = resultado * resultado
    }
    return resultado
    TODO("Calcular el factorial de n")
}

fun encontrarMaximo(numeros: List<Int>): Int {
    var maximo = numeros[0]
    for (numero in numeros) {
        if (numero > maximo) {
            maximo = numero
        }
    }
    return maximo
    TODO("Encontrar el valor maximo en la lista")
}

fun encontrarMinimo(numeros: List<Int>): Int {
    var minimo = numeros[0]
    for (numero in numeros) {
        if (numero < minimo) {
            minimo = numero
        }
    }
    return minimo
    TODO("Encontrar el valor minimo en la lista")
}

fun sumarLista(numeros: List<Int>): Int {
    var suma = 0
    for (numero in numeros) {
        suma += numero
    }
    return suma
    TODO("Sumar todos los elementos de la lista")
}

fun inverter(texto: String): String {
    var recorrido = ""
    for (letra in texto) {
        recorrido = letra + recorrido
    }
    return recorrido
    TODO("Invertir la cadena de texto")
}

fun contarVocales(texto: String): Int {
    var contador = 0
    for (letra in texto) {
        if (letra in "aeiouAEIOU") {
            contador += 1
        }
    }
    return contador
    TODO("Contar las vocales en el texto (considerar mayusculas y minusculas)")
}

fun esPalindromo(texto: String): Boolean {
    var recorrido = ""
    var recorrido_2 = ""
    for (letra in texto) {
        recorrido = recorrido + letra
    }
    for (letra in texto) {
        recorrido_2 = letra + recorrido_2
    }
    return if (recorrido == recorrido_2) true else false
    TODO("Verificar si el texto es un palindromo (ignorando espacios)")
}

fun tablaMultiplicar(numero: Int): List<Int> {
    val resultado = mutableListOf<Int>()
    for (i in 1..10) {
        resultado.add(numero * i)
    }
    return resultado
}
