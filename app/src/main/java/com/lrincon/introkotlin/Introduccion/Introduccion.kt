package com.lrincon.introkotlin.Introduccion

class Introduccion {
}

fun main() {
    println("Hola Laura Rincón") //Posee salto de linea, si no se desea entonces print()

    //Declaración de variables
    /*constante-> val nombre_de_la_variable:tipo_variable=asignacion
    variable: var nombre_de_la_variable:tipo_variable=asignacion*/

    val name:String="Laura"

    //Impresión y concatenación de variables con interpolación
    println("El nombre es $name \n")

    //Pedir información al usuario
    println("Ingrese su edad")
    var edad= readLine()!!.toInt()

    println("Ingrese su apellido")
    var apellido= readLine()!!.toString()

    println("La edad es $edad \n")
    println("Su apellido es $apellido \n")

}