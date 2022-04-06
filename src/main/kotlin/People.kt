fun main () {
    val likes = 71
    val variant1 = "Человеку"
    val variant2 = "Людям"

    val remains = likes % 10
    val result = if (remains == 1) variant1 else variant2
    print(" Понравилось : $likes $result")
}

