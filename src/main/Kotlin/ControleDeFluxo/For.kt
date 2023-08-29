package ControleDeFluxo

fun main(){
    val names = listOf<String>("Fulano", "Cicrano", "Deltrano", "Maltrano")

    for (name in names){
        println(name)
    }

    val tabuada = 2;
    for (num in 1..10){
        println("$tabuada x $num  == ${num * tabuada}")
    }
}