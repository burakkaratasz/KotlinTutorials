class Triangle(
    val a: Double,
    val b: Double,
    val c: Double,
    val h: Double
) : Shape("Triangle") {
    init {
        println("$name created with a: $a, b: $b, c: $c, and high: $h")
        println("$name area is: ${area()}")
        println("$name perimeter is: ${perimeter()}")
    }

    override fun area(): Double = (a*h)/2

    override fun perimeter(): Double = a+b+c
}