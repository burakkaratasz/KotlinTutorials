class Triangle(
    val a: Int,
    val b: Int,
    val c: Int,
    val h: Int
) {
    init {
        println("Triangle created with a: $a, b: $b, c: $c, and high: $h")
        println("Triangle area is: ${area()}")
        println("Triangle perimeter is: ${perimeter()}")
    }

    fun area() = (a * h) / 2
    fun perimeter() = (a + b + c)
}