class Tiempo(val hora: Int, val minuto: Int, val segundos: Int) {
    override fun toString(): String {
        return "${hora}h ${minuto}m ${segundos}s"
    }
}

fun main() {
    println("Dime la hora")
    var inHoras: Int
    try {
        inHoras = readLine()!!.toInt()
    } catch (e: NumberFormatException) {
        inHoras = 0
    }
    println("Dime los minutos")
    var inMinutos: Int
    try {
        inMinutos = readLine()!!.toInt()
    } catch (e: NumberFormatException) {
        inMinutos = 0
    }
    println("Dime los segundos")
    var inSegundos: Int
    try {
        inSegundos = readLine()!!.toInt()
    } catch (e: NumberFormatException) {
        inSegundos = 0
    }
    val tiempo = Tiempo(inHoras, inMinutos, inSegundos)
    println(tiempo)


}