package com.lrincon.introkotlin.Introduccion.quices

import kotlin.math.sqrt

class Calculadora {
}

fun main(){
    println("La opciones de operaciones son: 1.Suma, 2.Resta, 3.Multiplicacion, 4.Division, 5.Raiz cuadrada, 6.Potenciacion" +
            ". Por favor escriba el número de la operacion que desea hacer:")
    var operacion= readLine()!!.toInt()

    print("Ingrese primer número: ")
    var n1= readLine()!!.toDouble()

    print("Ingrese segundo número: ")
    var n2= readLine()!!.toDouble()

    when (operacion){
        1-> print("La suma es ${n1 + n2}")
        2-> print("La resta es ${n1 - n2}")
        3-> print("La multiplicación es ${n1 * n2}")
        4-> print("La división es ${n1/n2}")
        5-> print("La raíz cuadrada del primer número es ${sqrt(n1)} y del segundo número es ${sqrt(n2)}")
        6-> print("La potencia es ${Math.pow(n2, n1)}")
    }


}