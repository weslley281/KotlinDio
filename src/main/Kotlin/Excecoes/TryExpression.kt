package Excecoes

fun main() {
    val a = 10
    val b = 0

    val resultado = try {a/b} catch (e: ArithmeticException) {0}
    println(resultado)
}