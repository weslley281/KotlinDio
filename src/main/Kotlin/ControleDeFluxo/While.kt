package ControleDeFluxo

fun eatACake() = print("Comer Bolo")
fun bakeACake() = print("Assar um bolo")
fun main(){
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5){
        eatACake()
        println(" " + (cakesEaten + 1))
        cakesEaten++
    }

    do {
        bakeACake()
        println(" " + (cakesBaked + 1))
        cakesBaked++
    }while (cakesBaked < cakesEaten)
}