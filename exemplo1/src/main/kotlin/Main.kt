// Package
package lambdas

// Início da classe Aluno.
data class Aluno(val nome: String, val nota: Double)

// Início da função Main com Array
fun main(args: Array<String>) {

    // Variável com lista de alunos, e seus valores
    val alunos = arrayListOf(
        Aluno("Pedro", 7.4),
        Aluno("Artur", 8.0),
        Aluno("Rafael", 9.7),
        Aluno("Ricardo", 5.7)
    )

    // Variável para filtrar os alunos com nota maior de 7
    val aprovados = alunos.filter { it.nota > 7.0 }

    // Ordenando os alunos por nome
    aprovados.sortedBy { it.nome }

    // Exibição de resultados finais.
    println(aprovados)
}
