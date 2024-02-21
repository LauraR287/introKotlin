package com.lrincon.introkotlin.Introduccion.quices

class CaraYSello {
}

fun main(){
    print("Ingrese el número de veces que quiere jugar: ")
    var partidas= readLine()!!.toInt()

    for(i in 1..partidas){
        println("Seleccione un número para escoger la opción con la cual jugarás: 1.Cara ó 2.Sello")
        var opcion= readLine()!!.toInt()

        var comp = (1..2).random()
        if(comp == opcion){
            println("Has ganado!")
        } else {
            println("Perdiste :(")
        }
    }

}