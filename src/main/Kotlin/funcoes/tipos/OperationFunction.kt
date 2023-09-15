package funcoes.tipos

fun main(){
    operator fun Int.times(str: String) = str.repeat(this)

    operator fun String.get(range: IntRange) = substring(range)
    val str = "Nunca se esqueça de seus inimigos"
    println(str[0..14])
}