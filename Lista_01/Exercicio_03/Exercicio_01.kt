fun comprimentoOuZero(a: String?): Int{
    return a?.length ?: 0
}
fun main(){
    println(comprimentoOuZero(""))
}
