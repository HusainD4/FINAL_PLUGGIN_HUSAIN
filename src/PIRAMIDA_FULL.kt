
class PIRAMIDA_FULL(val baris:Int) {
    var k = 0
    fun printPiramidaFull() {
        for (i in 1..baris) {
            for (spasi in 1..baris - i) {
                print(" ")
            }
            while (k != 2 * i - 1) {
                print("*")
                ++k
            }

            println()
            k = 0
        }
    }
}

fun main() {
    val PiramidaFull = PIRAMIDA_FULL(8)
    PiramidaFull.printPiramidaFull()
}