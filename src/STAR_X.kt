class STAR_X ( val Koordinat:Int) {
    fun printStarX() {

        for (i in 0 until Koordinat) {
            for (j in 0 until Koordinat) {
                if (i == j || i + j == Koordinat - 1) {
                    print("*")
                } else {
                    print(" ")
                }
            }
            println()
        }
    }
}

fun main() {
    var X = STAR_X(11)
    X.printStarX()
}