package ControleDeFluxo

import MinhaClasse

fun main(){
    println(whenAssign("Olá"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MinhaClasse()))
}

fun whenAssign(obj: Any): Any{
    val result = when (obj){
        1 -> println("Um")
        "Olá" -> println("saudações")
        is Long -> println("Long")
        !is String -> println("Não é String")
        else -> println("Desconhecido")
    }
    return result
}