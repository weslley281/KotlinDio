package Classes

data class User(val name: String, val id: Int){
    override fun equals(other: Any?) = other is User && other.id == this.id
}

fun main(){
    val user = User("Alex", 1)
    println(user)

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("usuario == segundo usuario: ${user == secondUser}")
    println("usuario == terceiro usuario: ${user == thirdUser}")

    println(user.hashCode())
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    println(user.copy())
}