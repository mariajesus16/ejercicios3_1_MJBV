class Libro(val titulo: String, val autor: String, val numeroPag: Int, var calificacion: Int) {
    init {
        require(calificacion in 0..10) { "La calificación debe estar entre el 0 y el 10." }
    }
}

class ConjuntoLibros(var libros: Array<Libro?> = arrayOfNulls(10)) {
    var contador: Int = 0
    fun incorporar(l: Libro) {
        if (contador < 10) {
            libros.set(contador, l)
            contador++
        }


    }

    fun eliminarAutor() {}
    fun eliminarTitulo() {
    }

    fun mayorCalificacion() {

    }

    fun menorCalificacion() {}


}

fun main() {
    var conjunto = ConjuntoLibros()
    var libro1 = Libro("A dos metros de ti", "Rachael Lippincott", 288, 10)
    var libro2 = Libro("Déjate llevar", "Sarah Dessen", 456, 6)


    conjunto.incorporar(libro1)
    conjunto.incorporar(libro2)
    println(2)

}