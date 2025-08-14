fun descreveEndereco(a: String? = "Não informado", b: Int? = 0, c: String? = "Não informado") {return print("Rua $a, Nº $b, Cidade $c")}
fun main(){
    var rua = "Madalena"
    var num = 75
    var cid = "Manaus"
    descreveEndereco(rua, num, cid)
    println()
    descreveEndereco(rua, num)
    println()
    descreveEndereco(rua)
    println()
    descreveEndereco()
}
