package Classes

open class Dog{
    open fun sayHello(s: String = "Wow WoW") {
        println(s)
    }
}

class Yorkshire : Dog() {
    override fun sayHello(s: String) {
        super.sayHello("Wif Wif")
    }
}

fun main(){
    val dog: Dog = Yorkshire()
    val dog2 = Dog()
    dog.sayHello()
    dog2.sayHello()
}