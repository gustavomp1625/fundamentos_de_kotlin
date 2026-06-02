package edu.etec.ds.fundamentos

fun evaluarPositivo(numero: Int): String {
    return if (numero > 0) "Positivo" else "No positivo"
    TODO("Retornar \"Positivo\" si numero > 0, sino \"No positivo\"")
}

fun clasificarNumero(numero: Int): String {
    return if (numero == 10) "Igual a 10" else if (numero > 10) "Mayor a 10" else "Menor a 10"
    TODO("Clasificar: Mayor a 10, Menor a 10, o Igual a 10")
}

fun evaluarEdad(edad: Int): String {
    return if (edad >= 70) "Adulto mayor" else if (edad >= 18) "Adulto" else "Menor de edad"
    TODO("Menor de edad: < 18, Adulto: 18-65, Adulto mayor: > 65")
}

fun obtenerDescuento(monto: Double): Double {
    return if (monto >= 200) 30.0 else if (monto >= 150) 20.0 else 0.0
    TODO("Retornar descuento: 10% si monto >= 100, 20% si >= 150, 30% si >= 200, sino 0%")
}

fun calcular(operador: Char, a: Int, b: Int): Double {
    if (operador == '+') {
        return (a + b).toDouble()
    }
    if (operador == '-') {
        return (a - b).toDouble()
    }
    if (operador == '*') {
        return (a * b).toDouble()
    }
    if (operador == '/') {
        if(b == 0) {
            return 0.0
        }
        return (a / b).toDouble()
    }
    return (0.0)
    TODO("Realizar operacion: + - * /. Retornar 0.0 si division por cero u operador invalido")
}
