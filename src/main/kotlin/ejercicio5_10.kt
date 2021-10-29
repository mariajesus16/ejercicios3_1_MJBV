class Libro(var titulo: String, var autor: String, var numeroPag: Int, var calificacion: Int) {

}

class ConjuntoLibros() {
    var libros: Array<Libro?> = arrayOfNulls(10)
    fun incorporar(l: Libro) {
        if (libros.size < 10) {
            libros += l
        }
    }

    fun eliminarAutor() {}
    fun eliminarTitulo() {
    }

    fun mayorCalificacion(){

    }
    fun menorCalificacion(){}


}

fun main() {
    var libro1 = Libro("A dos metros de ti", "Rachael Lippincott", 288, 10)
    var libro2 = Libro("Déjate llevar", "Sarah Dessen", 456, 6)
    var conjunto = ConjuntoLibros()

    conjunto.incorporar(libro1)
    conjunto.incorporar(libro2)


}