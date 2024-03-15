// Pacote para o exemplo de coleções
package collections

// Função principal que inicia a execução do programa com um Array
fun main(args: Array<String>) {
    // Lista que contém elementos de tipos diferentes
    val listaMix = arrayListOf("Rafael", true, 1, 3.14, 'p')

    // Itera sobre cada item na lista
    for(item in listaMix) {
        // Verifica se o item é uma String usando smart cast
        if(item is String) {
            // Converte para maiúsculas e imprime se for uma String
            println(item.toUpperCase())
        }
        else {
            // Imprime o item se não for uma String
            println(item)
        }
    }
}
