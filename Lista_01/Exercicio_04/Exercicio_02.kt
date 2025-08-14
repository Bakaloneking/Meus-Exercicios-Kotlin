data class Retangulo(var larg: Double, var altu: Double){
    fun cal_area(): Double{
        return larg * altu
    }
    fun cal_perim(): Double{
        return 2*(larg + altu)
    }
    fun quadrOuRetan() = if (larg == altu) "Quadrado" else "Retângulo"
}

fun main(){
    var ret = Retangulo(
        larg = 25.5,
        altu = 20.5
    )
    println(ret.cal_area())
    println(ret.cal_perim())
    println(ret.quadrOuRetan())
}
