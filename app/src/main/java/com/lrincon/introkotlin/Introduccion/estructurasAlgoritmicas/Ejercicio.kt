package com.lrincon.introkotlin.Introduccion.estructurasAlgoritmicas

class Ejercicio {
}

fun main(){
    print("Ingrese un número:")
    var n1= readLine()!!.toInt()

    if(n1 in 1..10){
        println("El número $n1 está dentro del rango")
    } else {
        println("El número $n1 no está dentro del rango")
    }

    print("Ingrese una letra:")
    var l1:String= readLine()!!.toString().uppercase()
    var char = "a"
    var n2 = 1..10 step 2



}