import kotlin.random.Random

class Rectangle(
    val a: Double,
    val b: Double
) : Shape("Rectangle") {

    companion object{
        fun randomRectangle(): Rectangle{
            val a = Random.nextDouble(1.0,20.0)
            val b = Random.nextDouble(1.0, 20.0)
            return Rectangle(a,b)
        }
    }

    constructor(a: Double) : this(a, a)
    constructor(a: Int, b: Int) : this(a.toDouble(), b.toDouble())
    init {
        println("$name created with a = $a and b = $b")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
    }

    override fun area(): Double = a*b

    override fun perimeter(): Double = 2*(a+b)

    fun isSquare(){
        if (a==b){
            println("yes it is square")
        }
    }
}