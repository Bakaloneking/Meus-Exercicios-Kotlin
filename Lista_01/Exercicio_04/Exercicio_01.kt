data class Aluno (val nome: String, val matricula: String, var notas: List<Double>){
    fun cal_media(): Double {
        return notas.sum()/notas.size
    }
}
fun main() {
    val notas = listOf(7.5, 7.5, 7.5)
    val aluno = Aluno(
        nome = "Carlos",
        matricula = "2024006",
        notas = notas
    )
    println("Nome: ${aluno.nome}")
    println("Média: ${aluno.cal_media()}")
}
