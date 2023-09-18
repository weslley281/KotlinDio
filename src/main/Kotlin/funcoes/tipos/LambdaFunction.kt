package funcoes.tipos


fun main(){
    val upperCase1: (String) -> String = {str: String -> str.uppercase()}

    val upperCase2: (String) -> String = {str -> str.uppercase()}

    val upperCase3 = {str: String -> str.uppercase()}

    val upperCase5: (String) -> String = {it.uppercase()}

    val upperCase6: (String) -> String = String::uppercase

    println(upperCase1("olá"))
    println(upperCase2("olá"))
    println(upperCase3("olá"))
    println(upperCase5("olá"))
    println(upperCase6("olá"))
}


