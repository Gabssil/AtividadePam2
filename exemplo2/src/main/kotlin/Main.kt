// Função principal
fun main(args: Array<String>) {

    // Solicita e lê o primeiro número
    println("Digite o primeiro número: ")
    val primeiroNumero: Int = readLine()!!.toInt()

    // Solicita e lê o segundo número
    println("Digite o segundo número: ")
    val segundoNumero: Int = readLine()!!.toInt()

    // Calcula o produto dos dois números
    val resultado: Int = primeiroNumero * segundoNumero

    // Exibe o resultado
    println("O resultado da multiplicação é $resultado")
}
