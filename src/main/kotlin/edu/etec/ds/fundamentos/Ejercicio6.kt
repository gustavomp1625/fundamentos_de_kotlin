package edu.etec.ds.fundamentos

import kotlin.text.iterator

fun obtenerDiaSemana(dia: Int): String {
    val dia = 10
    val resultado = when (dia) {
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miércoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sabado"
        7 -> "Domingo"
        else -> "Dia invalido"
    }
    return resultado
    TODO("Usar when para retornar el nombre del dia (1=Lunes, 7=Domingo)")
}

fun obtenerNombreMes(mes: Int): String {
    val mes = 13
    val resultado = when (mes) {
        1 -> "Enero "
        2 -> "Febrero"
        3 -> "Marzo"
        4 -> "Abril"
        5 -> "Mayo"
        6 -> "Junio"
        7 -> "Julio"
        8 -> "Agosto"
        9 -> "Septiembre"
        10 -> "Octubre"
        11 -> "Noviembre"
        12 -> "Diciembre"
        else -> "Mes invalido"
    }
    return resultado
    TODO("Usar when para retornar el nombre del mes")
}

fun clasificarNumeroWhen(numero: Int): String {
    val resultado = when {
        numero > 0 -> "Positivo"
        numero < 0 -> "Negativo"
        else -> "Cero"
    }
    return resultado
    TODO("Usar when para clasificar: Positivo, Negativo o Cero")
}

fun clasificarEdad(edad: Int): String {
    val resultado = when {
        edad < 3 -> "Bebe"
        3 < edad && edad < 12 -> "Nino"
        13 < edad && edad < 17 -> "Adolescente"
        18 < edad && edad < 65 -> "Adulto"
        else -> "Anciano"
    }
    return resultado
    TODO("Usar when con rangos: Bebe (<3), Nino (3-12), Adolescente (13-17), Adulto (18-65), Anciano (>65)")
}

fun convertirMoneda(moneda: String, monto: Double): Double {
    val conver = when (moneda) {
        "USD" -> monto * 1.85
        "EUR" -> monto * 18
        "JPY" -> monto * 0.10
        else -> 0.0
    }
    return conver
    TODO("Convertir: USD a MXN (1.85), EUR a MXN (18), JPY a MXN (0.10), otro retorna 0")
}

fun realizarOperacion(operador: Char, a: Int, b: Int): Double {
    val resultado = when (operador) {
        '+' -> (a + b).toDouble()
        '-' -> (a - b).toDouble()
        '*' -> (a * b).toDouble()
        '/' -> (a / b).toDouble()
        '%' -> (a % b).toDouble()
        else -> 0.0
    }
    return resultado
    TODO("Usar when para realizar + - * / %. Division por cero retorna 0.0")
}

fun obtenerDescuentoWhen(monto: Double): Double {
    return when {
        monto > 200 -> monto * 0.10
        monto > 150 -> monto * 0.15
        monto > 100 -> monto * 0.10
        else -> 0.0
    }
    TODO("Usar when como expresion: >200 -> 25%, >150 -> 15%, >100 -> 10%, else 0%")
}

fun obtenerCalificacion(nota: Int): String {
    val calificacion = when {
        nota >= 90 -> "Promocionado"
        nota >= 60 -> "Aprobado"
        else -> "Desaprobado"
    }
    return calificacion
    TODO("Usar when con rangos: >=90 Promocionado, >=60 Aprobado, else Desaprobado")
}

fun esVocal(caracter: Char): Boolean {
    val esVocal = when (caracter) {
        'A','E','I','O','U' -> true
        'a','e','i','o','u' -> true
        else -> false
    }
    return esVocal
    TODO("Usar when para verificar si es vocal (a, e, i, o, u mayusculas y minusculas)")
}

fun esPrimo(numero: Int): Boolean {
    val primos = setOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29,31)
    return when (numero){
        in primos -> true
        else -> false
    }
    TODO("Usar when para determinar si un numero es primo (mayor a 1 divisible solo por 1 y si mismo)")
}
