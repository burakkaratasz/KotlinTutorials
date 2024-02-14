import kotlin.random.Random

class Circle(
    val radius: Double
) : Shape("Circle") {

    companion object{
        fun randomCircle(): Circle{
            val radius = Random.nextDouble(1.0,10.0)
            return Circle(radius)
        }
    }

    init {
        println("$name created with radius = $radius")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
    }

    override fun area(): Double = radius * ImportantNumbers.PI

    override fun perimeter(): Double = 2 * ImportantNumbers.PI * radius * radius
}