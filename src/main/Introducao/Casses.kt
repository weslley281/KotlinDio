class Cliente

class Contato(val id: Int, var email: String)

fun main(){
    val cliente = Cliente()

    val contato = Contato(1, "fulano@gmail.com")

    println(contato.id)
    println(contato.email)
    contato.email = "fulano2@gmail.com"
    println(contato.email)
}