import java.util.*

fun main(args: Array<String>) {
    println("Meu primeiro programa em Kotlin:  ")
    olaMundo()
//    controleDeFluxoIfElse()
//    controleDeFluxoWhen()
//    controleDeFluxoWhile()
//    controleDeFluxoFor()

//    ArraysLista()

//    println(hrsAtual())

    var total = soma(10, 20)
    println(total)

}


fun olaMundo(){

    //var nula: String = null <- erro
    var nula: String? = null //<- ?Depois do tipo da variavel
    nula = "Adicionar um valor a var criado como nula"
    println(nula.length)
    println(nula)

    var str: String? = "Primeira função em kotlin"//uma veriavel não mutavel
    println(str?.length)
    println(str)
}

fun controleDeFluxoIfElse() {

    println("----------Controle De Fluxo If-Else----------")

    var valor: Int? = 90

    if (valor == null) {
        println("Valor não existe")
    }else if (valor == 90) {
        println("O valor e 90")
    }else if (valor > 90){
        println("Valor maior que 90")
    }else if (valor < 90){
        println("Valor menor que 90")
    }
}

fun controleDeFluxoWhen(){

    println("----------Controle De Fluxo When----------")

    var valor: Int? = 90

    when(valor){
        1 -> println("O numero e 1")
        2 -> println("O numero e 2")
        3 -> println("O numero e 3")
        4 -> println("O numero e 4")
        else -> {
            println("Não listado")
        } }

    var valor2 = when(valor){
        1 -> ("O numero e 1")
        2 -> ("O numero e 2")
        3 -> ("O numero e 3")
        4 -> ("O numero e 4")
        else -> {
            ("Não listado")
        } }

    println("Valor é: $valor - $valor2")
}

fun controleDeFluxoWhile(){

    println("----------Controle De Fluxo While----------")

    var contador = 1

    while (contador <= 10){
        print(" $contador")
        contador++
    }
    println()
}

fun controleDeFluxoFor(){

    println("----------Controle De Fluxo For----------")

    for (item in 1..10){
        print(" $item")
    }
    println()
}

fun ArraysLista() {
    println("----------Arrays----------")

    println("Array de Strings: ")
    var array = arrayOf("Sp", "Rj", "Bh")

    for (inte in array) {
        print("$inte ")
    }
    println()
    array[0] = "Rj"
    array[1] = "Sp"
    for (inte1 in array) {
        print("$inte1 ")
    }
    println()


    println("Array com varios tipos de dados: ")
    var mix = arrayOf("Sp", 9, "Rj", "Bh", 12)

    for (inte1 in mix) {
        print("$inte1 ")
    }
    println()

    println("Array com inteiros: ")
    var inteiros = intArrayOf(9, 12, 8, 90)

    for ((index, inteiro) in inteiros.withIndex()) {
        println("Index $index - Valor $inteiro")
    }
    println()

    println("somando as arrays ")

    var estados = arrayOf("Rs", "Sc", "Pa")

    var estadosFull = estados + array

    for (inte1 in estadosFull) {
        print("$inte1 ")
    }
    println()
}

fun hrsAtual(): Date {
    return Date()
}

fun soma(a: Int, b: Int): Int {
    return a + b
}
