package com.lrincon.introkotlin.Introduccion.estructurasAlgoritmicas

class RetoII {
}

fun main() {
    print("Ingrese el peso del bebé: ")
    var pesoBebé= readLine()!!.toInt()

    print("Ingrese cuantos meses tiene el bebé: ")
    var mesesBebé= readLine()!!.toInt()

    val dosisVacuna:Int = ((pesoBebé + 10) / (mesesBebé * 10)) * 8;

    println("La dosis a aplicar es $dosisVacuna")
}