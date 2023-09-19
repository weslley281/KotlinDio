package Excecoes

fun main() {
    val a = 10
    val b = 0

    try {
        val resultado = a/b
    }catch (e: ArithmeticException){
        println("Ocorreu um erro aritimético: ${e.message}")
    }
    catch (e: Throwable){
        println(e.message)
    }finally {
        println("Finalizou")
    }
}