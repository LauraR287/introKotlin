package com.lrincon.introkotlin.Introduccion

class RetoI {
}

fun main() {
    print("Ingrese la temperatura en grados Fahrenheit ºF: ")
    var fahrenheit= readLine()!!.toInt()

    val centigrados:Double = (fahrenheit - 32) / 1.8;

    println("La temperatura en celsius es $centigrados")
}