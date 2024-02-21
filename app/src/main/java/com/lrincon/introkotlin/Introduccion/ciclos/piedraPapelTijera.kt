package com.lrincon.introkotlin.Introduccion.ciclos

class piedraPapelTijera {
}

fun main(){
    print("Ingrese el número de veces máximas que quiere jugar: ")
    var partidas= readLine()!!.toInt()
    var marcador_comp = 0;
    var marcador_u = 0;

    for(i in 1..partidas){
        var vidas = partidas;

        if(vidas == 0){
            println("Lo siento, se han acabado las vidas :(")
            println("Marcador final: computador $marcador_comp - usuario $marcador_u")
        } else {
            println("Seleccione un número para escoger la opción con la cual jugarás: 1.Piedra, 2.Papel ó 3.Tijera")
            var opcion = readLine()!!.toInt()

            var comp = (1..3).random()

            if (comp == opcion) {
                println("Has ganado!")
                marcador_u += 1
            } else {
                vidas = partidas - 1
                println("Perdiste :(")
                marcador_comp += 1
            }
        }
        println("Marcador final: computador $marcador_comp - usuario $marcador_u")
    }
}