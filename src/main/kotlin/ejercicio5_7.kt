class Coche(
    var color: String,
    val marca: String,
    val modelo: String,
    val caballos: Int,
    val puertas: Int,
    val matricula: String
) {
    override fun toString(): String {
        return "El $marca $modelo con matrícula $matricula,es de color $color, tiene $caballos CV y $puertas puertas."
    }

}

fun solicitarNuevoColor(): String {
    println("¿De que color quieres cambiar el coche?")
    var color = readLine().toString()
    return color
}

fun main() {
    var coche1 = Coche("Blanco", "bmw", "x1", 192, 5, "1632GBS")
    var coche2 = Coche("Negro", "Ford", "Mustang", 290, 3, "7391PGT")
    println("${coche1.toString()}")
    println("${coche2.toString()}")
    coche1.color = solicitarNuevoColor()
    println("${coche2.toString()}")


}