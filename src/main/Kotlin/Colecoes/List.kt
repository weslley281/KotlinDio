package Colecoes

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)
val sudoers: List<Int> = systemUsers

fun addSystemUser(newUser: Int) {
    systemUsers.add(newUser)
}

fun getSystemUsersList(): List<Int> {
    return sudoers
}

fun main(){
    addSystemUser(4)
    println("Total de sudoers: ${getSystemUsersList().size}")
    getSystemUsersList().forEach {
            i -> println("Alguma informação útil no usuário $i")
    }
}