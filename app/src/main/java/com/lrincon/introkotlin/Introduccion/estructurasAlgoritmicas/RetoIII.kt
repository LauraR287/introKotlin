package com.lrincon.introkotlin.Introduccion.estructurasAlgoritmicas

class RetoIII {
}

fun main() {
    print("Ingrese primer número: ")
    var numero1= readLine()!!.toInt()

    print("Ingrese segundo número: ")
    var numero2= readLine()!!.toInt()

    println("Escriba en minúscula y sin espacios la operacion que desea realizar. Recuerda que las operaciones disponibles" +
            " son: suma, resta, division, multiplicacion")
    var operacion= readLine()!!.toString()

    if(operacion == "suma"){
        val suma:Int = numero1 + numero2;
        println("El valor de la suma es $suma")
    } else if(operacion == "resta"){
        val resta:Int = numero1 - numero2;
        println("El valor de la resta es $resta")
    } else if(operacion == "multiplicacion"){
        val multiplicacion:Int = numero1 * numero2;
        println("El valor de la multiplicacion es $multiplicacion")
    } else if(operacion == "division"){
        val division:Int = numero1 / numero2;
        println("El valor de la division es $division")
    } else {
        println("No se encontró la operación que necesitas :(")
    }
}