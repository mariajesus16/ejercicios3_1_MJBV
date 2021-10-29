class Cuenta(var numCuenta: String, var saldo: Float = 0.0F) {
    fun saldoDisponible(): String {
        return "Saldo disponible en la $numCuenta: $saldo€."
    }

    fun recibirAbono(abono: Float): Float {
        this.saldo = this.saldo + abono
        return saldo
    }


    fun realizarPago(pago: Float): Float {
        this.saldo = this.saldo - pago
        return saldo
    }
}

class Persona(var DNI: String) {
    var cuentas: Array<Cuenta?> = arrayOf()
    fun incorporar(c: Cuenta) {
        if (cuentas.size < 3) {
            cuentas += c
        }
    }

    fun esMorosa(): Boolean {
        for (i in 0..2) {
            if (this.cuentas[i]!!.saldo < 0) return true
        }
        return false
    }

    fun transferencia(a: Cuenta, b: Cuenta, movimiento: Float) {
        a.realizarPago(movimiento)
        b.recibirAbono(movimiento)
    }
}

fun main() {
    var p = Persona("48320172M")

    var cuenta1 = Cuenta("cuenta1")
    var cuenta2 = Cuenta("cuenta2", 700.0F)

    p.incorporar(cuenta1)
    p.incorporar(cuenta2)
    println("La persona con dni ${p.DNI}, recibe una nómina mensual de 1100€ en la ${cuenta1.numCuenta}.")
    cuenta1.recibirAbono(1100.0F)
    println(cuenta1.saldoDisponible())
    println("La persona con dni ${p.DNI}, tiene que pagar el alquiler de 750€ en la ${cuenta2.numCuenta}.")
    cuenta2.realizarPago(750.0F)
    println(cuenta2.saldoDisponible())

    try { if(p.esMorosa() == true) {
        println("La persona con dni ${p.DNI} es moroso/a.")
    }}catch (e:ArrayIndexOutOfBoundsException){1}

    repeat(80){ print("*")}
    println()

    println("Se realiza una transferencia de 100€ desde la ${cuenta1.numCuenta} a la ${cuenta2.numCuenta}.")
    p.transferencia(cuenta1,cuenta2,100.0F)
    println(cuenta1.saldoDisponible())
    println(cuenta2.saldoDisponible())


}