package Classes

open class Tiger(val origin: String){
    fun sayHello(){
        println("Um tigre de $origin diz: grrhhhh")
    }
}

class SiberianTiger : Tiger("Sibéria")

fun main(){
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}