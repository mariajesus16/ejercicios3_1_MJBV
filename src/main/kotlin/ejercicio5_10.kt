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

    fun eliminarPorAutor(a: String): Boolean {
        for (i in 0..10) {
            if (libros[i]?.autor == a) {
                libros[i] = null
                return true
            }
        }
        return false
    }

    fun eliminarPorTitulo(b: String): Boolean {
        for (i in 0..10) {
            if (libros[i]?.titulo == b) {
                libros[i] = null
                return true
            }
        }
        return false
    }

    fun mostrarLibros() {
        for (i in 0..10) {
            try {
                if (libros[i]?.titulo !== null) {
                    println("-${libros[i]?.titulo}, de ${libros[i]?.autor}.")
                }
            } catch (e: ArrayIndexOutOfBoundsException) {
            }


        }
    }
}

fun main() {
    var conjunto = ConjuntoLibros()
    var libro1 = Libro("A dos metros de ti", "Rachael Lippincott", 288, 10)
    var libro2 = Libro("Déjate llevar", "Sarah Dessen", 456, 6)

    println("Incorporamos los libros.")
    conjunto.incorporar(libro1)
    conjunto.incorporar(libro2)
    repeat(80) { print("*") }
    println()
    println("Eliminamos los libros por autor y titulo.")
    conjunto.eliminarPorAutor("Sarah Dessen")
    conjunto.eliminarPorTitulo("A dos metros de ti")
    repeat(80) { print("*") }
    println()
    println("Incorporamos otro libro.")
    conjunto.incorporar(libro1)
    repeat(80) { print("*") }
    println()
    println("Los libros almacenados son:")
    conjunto.mostrarLibros()


}