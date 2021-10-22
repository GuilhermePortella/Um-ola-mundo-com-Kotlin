package Cap_2

class Carro(var cor: String,var ano: Int,var modelo: String){

    fun acelerar() {
        println("Velocidade do $modelo")
    }
}

fun main(args: Array<String>) {
    val BMW = Carro("Branoc", 2022, "X7")
    println("Mercedes: ${BMW.modelo}, Ano: ${BMW.cor}, Ano: ${BMW.ano}")

    BMW.acelerar()

    val mercedes = Carro("Branco", 2021, "S 500 L")
    println("Mercedes: ${mercedes.modelo}, Ano: ${mercedes.cor}, Ano: ${mercedes.ano}")

    mercedes.acelerar()

}