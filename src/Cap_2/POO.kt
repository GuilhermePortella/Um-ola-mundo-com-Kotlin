package Cap_2

interface Dirigivel{
    fun acelerar(velocidade: Long)
}

interface Carga {
    fun qtdCarga(quantidade: Int)
}

open class Veiculo(open var cor: String, open var ano: Int, open var modelo: String)

class Carro(override var cor: String,override var ano: Int,override var modelo: String): Veiculo(cor, ano, modelo), Dirigivel {
    override fun acelerar(velocidade: Long) {
        println("Acelerando o $modelo a $velocidade por hora")
    }
}

class Caminhao(override var cor: String,override var ano: Int,override var modelo: String, var capacidade: Long): Veiculo(cor, ano, modelo), Dirigivel, Carga {
    override fun acelerar(velocidade: Long) {
        println("Acelerando o $modelo a $velocidade por hora")
    }

    override fun qtdCarga(quantidade: Int) {
        println("Carregando o caminhão com: $quantidade de toneladas")
    }
}


fun main(args: Array<String>) {
    val mercedes = Carro("Branco", 2021, "S 500 L")
    println("Mercedes: ${mercedes.modelo}, Ano: ${mercedes.cor}, Ano: ${mercedes.ano}")
    mercedes.acelerar(90)

    val scania = Caminhao("Preto", 2021, "P 360 Bitruck", 1000)
    println("scania: ${scania.modelo}, Ano: ${scania.cor}, Ano: ${scania.ano}, capacidade ${scania.capacidade}")
    scania.acelerar(40)
    scania.qtdCarga(6)
}