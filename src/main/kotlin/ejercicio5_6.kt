class Rectangulo(val base: Int, val altura: Int) {
    fun area(): Int = base * altura
    fun perimetro(): Int = 2 * (base + altura)
    override fun toString(): String {
        return "de base $base y de altura $altura,"
    }
}

fun main() {
    var rectangulo1 = Rectangulo(4, 6)
    var rectangulo2 = Rectangulo(12, 8)
    var rectangulo3 = Rectangulo(7, 5)
    println("Para el rectángulo ${rectangulo1.toString()} el área es ${rectangulo1.area()} y el perímetro ${rectangulo1.perimetro()}")
    println("Para el rectángulo ${rectangulo2.toString()} el área es ${rectangulo2.area()} y el perímetro ${rectangulo2.perimetro()}")
    println("Para el rectángulo ${rectangulo3.toString()} el área es ${rectangulo3.area()} y el perímetro ${rectangulo3.perimetro()}")
}