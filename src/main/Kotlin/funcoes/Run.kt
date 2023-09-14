package funcoes

fun main (){
    fun getNullableLength(ns: String?) {
        println("for \"$ns\":")
        ns?.run {
            println("\testá vazio? " + isEmpty())
            println("\ttamanho = $length")
            length
        }
    }

    getNullableLength(null)
    getNullableLength("")
    getNullableLength("alguma coisa")
}