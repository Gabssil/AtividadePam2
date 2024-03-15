
// Pacote para o exemplo de coleções
package collections

// Função principal que inicia a execução do programa
fun main(args: Array<String>) {
    // Declaração de variáveis para listas de números e strings
    val numeros = arrayListOf(1, 2, 3, 4, 5)
    val strings = arrayListOf("Rafael", "Pedro", "Leandro", "Gustavo")

    // União das duas listas
    val uniao = numeros + strings

    // Itera sobre a lista unida
    for(item in uniao) {
        // Exibe cada item
        println(item)
    }
}
