package ControleDeFluxo

fun main(){
    for (c in 'a'..'d'){
        print(c + ", ")
    }
    println("")
    for (c in 'z' downTo 's' step 2){
        print(c + ", ")
    }
    println("")
    for (c in 'a'..'d'){
        print(c + ", ")
    }
}