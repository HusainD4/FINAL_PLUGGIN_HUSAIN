class Hollow(val rows:Int) {
    fun printHollow() {
        for (i in 1..rows) {
            for (j in i..rows) {
                print("  ")
            }
            for (j in 1 until i) {
                if (i == rows || j == 1)
                    print("* ")
                else
                    print("  ")
            }
            for (j in 1..i) {
                if (i == rows || j == i)
                    print("* ")
                else
                    print("  ")
            }
            println()
        }
    }
}

fun main() {
    var hollow = Hollow(6)
    hollow.printHollow()
}