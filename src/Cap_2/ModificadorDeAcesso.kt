package Cap_2

open class Animal {
    private var nome = "Thor"
    protected var ano = 2020
    internal var raca = "Pastor alemão"
}

class Cachorro: Animal() {
    fun idade() {
        println("A idade é: " + (2021 - ano))
    }
}

fun main(args: Array<String>) {
    val dog = Cachorro()

    dog.idade()
    println(dog.raca)
}