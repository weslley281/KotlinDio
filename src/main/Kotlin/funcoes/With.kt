package funcoes
class Configuration(var host: String, var port: Int)
fun main() {
    val configuration = Configuration("192.168.0.1",5000)

    with(configuration) {
        println("Host: $host")
        println("Port: $port")
    }

    println("http://${configuration.host}:${configuration.port}")
}