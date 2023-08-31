package ControleDeFluxo

fun main () {
    val authors = setOf("Fulano", "Cicrano", "Deltrano")
    val writers = setOf("Cicrano", "Deltrano", "Fulano")

    println(authors == writers)
    println(authors === writers)
}