package funcoes.tipos

fun main(){
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")

    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val fulano = Person("Fulano")
    val cicrano = Person("Cicrano")
    fulano likes cicrano
}

class Person(val name: String){
    val LikedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {LikedPeople.add(other)}
}