fun main(){
    cases("Olá")
    cases(1)
    cases(0L)
    cases(MinhaClasse())
    cases("olá")
}

fun cases(obj: Any){
    when (obj){
        1 -> println("Um")
        "Olá" -> println("saudações")
        is Long -> println("Long")
        !is String -> println("Não é String")
        else -> println("Desconhecido")
    }
}

class MinhaClasse