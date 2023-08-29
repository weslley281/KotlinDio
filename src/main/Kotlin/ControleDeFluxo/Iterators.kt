package ControleDeFluxo

class Animal(val name:String)
class Zoo(val animals: List<Animal>){
    operator fun iterator(): Iterator<Animal>{
        return animals.iterator()
    }
}

fun main(){
    val animals = listOf<Animal>(Animal("zebra"), Animal("leão"))
    val zoo = Zoo(animals)
    for (animal in zoo){
        println("Preste atenção, é uma ${animal.name}")
    }
}