package com.lrincon.introkotlin.Introduccion.ciclos

class piedraPapelTijeraDoWhile {
}

fun main() {
    print("Ingrese el número de veces máximas que quiere jugar: ")
    var partidas= readLine()!!.toInt()

    var vidas = partidas
    var marcador_comp = 0
    var marcador_u = 0

    do {

        println("Seleccione un número para escoger la opción con la cual jugarás: 1.Piedra, 2.Papel ó 3.Tijera")
        var opcion= readLine()!!.toInt()

        var comp = (1..3).random()

        if (comp == opcion) {
            println("Has ganado!")
            marcador_u += 1
        } else {
            println("Perdiste :(")
            marcador_comp += 1
            vidas -= 1
        }
        partidas -= 1
        println("Vidas restantes: $vidas")

    }while (vidas!=0 && partidas!=0)

    println("Lo siento, se han acabado los intentos :(")
    println("Marcador final: computador $marcador_comp - usuario $marcador_u")
}