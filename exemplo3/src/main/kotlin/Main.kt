// Pacote para o exemplo de coleções
package collections

// Função principal que inicia a execução do programa com um Array
fun main(args: Array<String>) {
    // Declaração de uma lista de strings
    val strings = arrayListOf("Carro", "Moto", "Barco", "Avião")
    // Itera sobre cada elemento da lista
    for(item in strings) {
        // Imprime cada item da lista em letras maiúsculas
        println(item.toUpperCase())
    }
}