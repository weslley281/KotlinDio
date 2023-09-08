package Colecoes

fun main(){
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val positives = numbers.filter { x -> x > 0 }

    val negatives = numbers.filter { x -> x < 0 }

    println("numeros positivos = $positives")
    println("numeros negativos = $negatives")

    val doubled = numbers.map { x -> x * 2 }
    val tripled = numbers.map { x -> x * 3 }

    println("duplicando para = $doubled")
    println("triplicando para = $tripled")
}