fun main(){
    printAll("Oi", "Oi", "Boa noite", "Oi Boa Noite", "Oi Boa Noite", "Oi Boa Noite", "Oi Boa Noite")
    log("Oi", "Oi", "Boa noite", "Oi Boa Noite", "Oi Boa Noite", "Oi Boa Noite", "Oi Boa Noite")
    printAllMessageWithPrefix( "Oi", "Oi", "Boa noite", "Oi Boa Noite", "Oi Boa Noite", "Oi Boa Noite", "Oi Boa Noite", prefix = "O chato fala!!!")
}

fun printAll(vararg messages: String){
    for (message in messages){
        println(message)
    }
}

fun printAllMessageWithPrefix(vararg messages: String, prefix: String){
    for (message in messages) {
        println("[$prefix] $message")
    }
}

fun log(vararg entries: String){
    printAll(*entries)
}