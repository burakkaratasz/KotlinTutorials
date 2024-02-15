import kotlin.random.Random
import java.lang.Exception

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
        try {
            if(radius < 0){
                throw NegativeNumberException()
            }
            println("$name created with radius = $radius")
            println("$name area is ${area()}")
            println("$name perimeter is ${perimeter()}")
        } catch (e: NegativeNumberException){
            println(e.message)
        }
    }

    override fun area(): Double = radius * ImportantNumbers.PI

    override fun perimeter(): Double = 2 * ImportantNumbers.PI * radius * radius

}
    class NegativeNumberException : Exception("You cannot enter the negative radius number. ")
