// Pacote para o exemplo de coleções
package collection

// Definição da classe Frutas para representar frutas com nome e preço
data class Frutas(var nome: String, var preco: Double)

// Função principal que inicia a execução do programa
fun main(args: Array<String>) {
    // Lista de frutas com nome e preço
    var frutas = arrayListOf(Frutas("Banana", 1.50), Frutas("Laranja", 3.20))

    // Itera sobre cada fruta na lista de frutas
    for (fruta in frutas) {
        // Exibe o nome e o preço de cada fruta
        println("Nome: ${fruta.nome} - R$ ${fruta.preco}")
    }
}

