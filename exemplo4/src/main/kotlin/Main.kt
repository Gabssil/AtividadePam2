// Pacote para o exemplo de coleções
package collections

// Função principal que inicia a execução do programa com um Array
fun main(args: Array<String>) {
    // Declaração de variáveis para lista de números pares e ímpares
    val pares = arrayListOf(2, 4, 6)
    val impares = intArrayOf(1, 3, 5)

    // União das listas de números pares e ímpares, e em seguida ordenação
    for (n in impares.union(pares).sorted()) {
        // Impressão do número
        print("$n ")
    }
}
