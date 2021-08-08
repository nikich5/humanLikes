fun main() {
    val numberOfLikes = 51
    if ((numberOfLikes % 100) == 11) {
        println("Понравилось $numberOfLikes людям")
    } else if ((numberOfLikes % 10) == 1) {
        println("Понравилось $numberOfLikes человеку")
    } else {
        println("Понравилось $numberOfLikes людям")
    }
}