
// Pacote para o exemplo de coleções
package collections

// Função principal que inicia a execução do programa
fun main(args: Array<String>) {
    // Declaração da variável matriz como uma matriz 3x3 inicializada com nulos
    val matriz = Array(3) { arrayOfNulls<Int>(3) }

    // Atribuição dos valores nas posições da matriz
    matriz[0][0] = 1
    matriz[0][1] = 2
    matriz[0][2] = 3
    matriz[1][0] = 4
    matriz[1][1] = 5
    matriz[1][2] = 6
    matriz[2][0] = 7
    matriz[2][1] = 8
    matriz[2][2] = 9

    // Itera sobre cada linha e coluna da matriz e exibe o valor
    for ((linha, linhaArray) in matriz.withIndex()) {
        for ((coluna, valor) in linhaArray.withIndex()) {
            println("[$linha][$coluna] = ${matriz[linha][coluna]}")
        }
    }

    // Itera sobre cada elemento da matriz e exibe o valor
    matriz.forEach {
        it.forEach {
            // Resultado final
            println(it)
        }
    }
}
