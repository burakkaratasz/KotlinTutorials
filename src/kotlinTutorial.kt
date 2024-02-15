import java.lang.NumberFormatException
fun main() {
//    print("bir kelime giriniz: ")
//    val myString = readLine()
//    if(myString != null && myString == myString.reversed()){
//        println("$myString is a palindrome word")
//    }
//    else{
//        println("$myString is not a palindrome word")
//    }

//    print("yaşınızı giriniz: ")
//    val yas = readLine()
//    if(yas != null && yas.toInt() >= 18 && yas.toInt() < 65){
//        println("You are an adult")
//    }
//    else if(yas != null && yas.toInt() >= 65){
//        println("You are an old")
//    }
//    else{
//        println("You are a child")
//    }

//    val myArray = arrayOf(1,2,3)
//    println(myArray[0])

//    var x = 3
//    while(x > 0){
//        println("hello")
//        x--
//    }
//    println("no hello")
//    val myArray = arrayOf(1, 2, 3)
//    var i = 0
//    while(i < myArray.size){
//        println(myArray[i])
//        i++
//    }

//    print("Please enter a number: ")
//    var num = readln()?.toIntOrNull() ?: 0
//    println("let's count from $num to 0")
//    val i = 0
//    while (i <= num) {
//        println(num)
//        num--
//    }

//    println("Enter the number 1: ")
//    var num1 = readln().toIntOrNull() ?: 0
//    println("Enter the number 2: ")
//    var num2 = readln().toIntOrNull() ?: 0
//    var result = 1
//    var i = 1
//
//    while(i <= num2){
//        result *= num1
//        i++
//    }
//    println("$num1 to the power of $num2 is $result")

//    for(i in 1..3){
//        println(i)
//    }

//    for(i in 10 downTo 5 step 2){
//        println(i)
//    }

//    val myArray = arrayOf(3,5,9,1,11)
//    var max = myArray[0]
//    for(item in myArray){
//        if(item > max){
//            max = item
//        }
//    }
//    println("max item is: $max")

//    val myArray = arrayOf(2,7,11,9,6)
//    var sum = 0
//    for(item in myArray){
//        sum = item + sum
//    }
//    println("The sum of the array is: $sum")

//    var sum:Double = 0.00
//    var i = 0
//    println("Enter 5 numbers: ")
//    while(i < 5){
//        var myArray = arrayOf(readln().toIntOrNull())
//        for(item in myArray){
//            sum += item!!
//        }
//        i++
//    }
//    sum /= 5
//    println("The avarage value is: $sum")

//    val myList = mutableListOf<Int>()
//    println("10 adet sayı giriniz: ")
//    for(i in 1..10){
//        val x = readln().toIntOrNull()
//        if(x!=null){
//            myList.add(x)
//        }
//    }
//    println(myList)

//    val myList = mutableListOf<Int>()
//    println("please enter 5 number: ")
//    for(i in 1..5){
//        val x = readln().toIntOrNull()
//        if (x != null){
//            myList.add(x)
//        }
//    }
//    println("The 5 numbers in reverse order are: ")
//    for (i in myList.asReversed()){
//        println(i)
//    }

//    //FIBONACCI ALGORITHM
//    println("enter a number n > 1: ")
//    var n = readln().toIntOrNull()
//    var count = 2
//    var num1 = 0
//    var num2 = 1
//    var sum = 0
//    val myList = mutableListOf<Int>()
//    myList.add(num1)
//    myList.add(num2)
//    while(count != n){
//        sum = num1 + num2
//        myList.add(sum)
//        num1 = num2
//        num2 = sum
//        count++
//    }
//    println(myList)

//    print("yaşınızı giriniz: ")
//    val age = readLine()?.toInt()
//    when(age){
//        in 0..5 -> println("You're a young kit")
//        in 6..17 -> println("You're a teenager")
//        18 -> println("Finally, you're 18!")
//        19, 20 -> println("You're a young adult")
//        in 21..65 -> println("You're an adult")
//        else -> println("You're really old")
//    }

//    print("Where are you from? ")
//    val from = readLine()
//    when(from){
//        "USA", "England" -> println("Hello!")
//        "Turkiye" -> println("Merhaba!")
//        "Germany" -> println("Hallo!")
//        else -> println("I don't know")
//    }

//    printThreeLines()

//    calculatePow(3, 5)

//    calculateSum(5)

//    val numbers = listOf(1,2,3,4,5)
//    val result = searchList(numbers, 3)
//    println(result)

//    val max = getMax(1,2,3,4,11,9,10)
//    println("the maximum is $max")

//    searchFor("sahibinden.com")
//    searchFor("getir.com", "Bing")

//    val sum = alternatingSum(3,4,5,2,1,2,3)
//    println("the alternating sum is $sum")

//    print("please enter a number: ")
//    val input = readln().toIntOrNull()
//    if(input != null){
//        if(input.isPrime()){
//            println("$input is a prime number")
//        }
//        else{
//            println("$input is not a prime number")
//        }
//    }

//    val numbers = listOf(1,2,3,4,5,6)
//    val result = numbers.whatTimes()
//    println(result)

//    val myRect = Rectangle(4.0,7.0)
//    println("rectangle area is ${myRect.area()}")
//    println("rectangle perimeter is ${myRect.perimeter()}")
//    println("Is rectangle a square? ${myRect.isSquare()}")

//    val myCircle = Circle(5.0)

//    val myTriangle = Triangle(5,3,4,6)

//    val myCircle1 = Circle(5.0)
//    myCircle1.changeName("brk")
//    println(myCircle1.name)

//    val myTriangle1 = Triangle(3,4,5,4)
//    myTriangle1.changeName("karub")
//    println(myTriangle1.name)

//    val myCar1 = FamilyCar()
//    myCar1.parking()
//    println()
//    val myCar2 = SportCar()
//    myCar2.drifting()

//    val rect = Rectangle(11.0)
//    val circle = Circle(5.0)
//    val triangle = Triangle(7.0,7.0,7.0, 5.0)
//
//    val maxArea = maxArea(rect, circle)
//    val maxArea2 = maxArea(rect, circle, triangle)
//
//    println("the max area first is: $maxArea")
//    println("the max area second is: $maxArea2")

//    val numbers = listOf(1,2,3,4,5,6)
//    val result = numbers.mySort()
//    println(result)
//
//    val numbers2 = arrayOf(1,2,3,4,5)
//    val result2 = numbers2.mySort()
//    println(result2)

//    val circle = Circle.randomCircle()

//    val rectangle = Rectangle.randomRectangle()

    //ANONYMOUS CLASSES
//    val a = 3.0
//    val b = 4.0
//    val height = 2.0
//    val parallelogram = object : Shape("Parallelogram",a,b,height){
//
//        init {
//            println("Parallelogram created with a = $a, b = $b and height = $height")
//            println("The area is ${area()}")
//            println("The perimeter is ${perimeter()}")
//        }
//
//        override fun area(): Double {
//            return a * height
//        }
//
//        override fun perimeter(): Double {
//            return (a+b)*2
//        }
//
//        fun isRectangle(): Boolean = height == b
//    }
//    println("Is the parallelogram rectangle ? ${parallelogram.isRectangle()}")

//    val a = 4.0
//    val b = 6.0
//    val c = 6.0
//    val d = 8.0
//    val height = 4.0
//    val parallelogram = object : Shape("Trapeze",a,b,c,d,height){
//        init {
//            println("Trapeze created with a = $a, b = $b, c = $c, d = $d and height = $height")
//            println("The area is ${area()}")
//            println("The perimeter is ${perimeter()}")
//        }
//
//        override fun area(): Double {
//            return ((a+d)*height)/2
//        }
//
//        override fun perimeter(): Double {
//            return a+b+c+d
//        }
//    }

//    print("please enter the number: ")
//    val input = try {
//        readln()?.toInt()
//    } catch (e: NumberFormatException){
//        0
//    } finally {
//        println("This is from the finally block")
//    }
//    println("you entered: $input")

//    println(divide(5.0,0.0))

//    val division = try {
//        divide(5.0,0.0)
//    } catch (e: DivisionByZeroException){
//        0.0
//    }
//    println("the result of the division is $division")

//    val myCircle = Circle(-1.0)

    //LAMBDA FUNCTIONS
//    var list = (1..20).toList()
//    println(list)
//    list = list.filter { it % 2 == 0 }
//    println(list)

    val circle1 = Circle(5.0)
    val circle2 = Circle(3.5)
    val triangle1 = Triangle(4.0,5.0,3.0,4.5)
    val triangle2 = Triangle(2.0,1.0,2.0,1.5)
    val rectangle1 = Rectangle(2,3)
    val rectangle2 = Rectangle(3.5)

    var shapes = listOf(circle1,circle2,triangle1,triangle2,rectangle1,rectangle2)
    shapes = shapes.customFilter() { shape, string -> shape.area() > 5.0}
    for (shape in shapes){
        println("${shape.name}: Area: ${shape.area()}")
    }




}

fun printThreeLines(){
    println("first line")
    println("second line")
    println("third line")
}

fun calculatePow(base: Int, exponent: Int){
    var result = 1
    for(i in 1..exponent){
        result *= base
    }
    println("$base to the power of $exponent is: $result")
}

fun calculateSum(num: Int){
    var result = 0
    for(i in 1..num){
        result += i
    }
    println("The sum of the values from 1 to $num is: $result ")
}

fun <T> searchList(list: List<T>, item: T): String{
    for((index, value) in list.withIndex()){
        if(value == item){
            return "The index of $item is ${index + 1}"
        }
    }
    return "$item is not on the list"
}

fun getMax(vararg numbers: Int): Int{
    var max = numbers[0]
    for(number in numbers){
        if(number > max){
            max = number
        }
    }
    return max
}

fun searchFor(search: String, searchEngine: String = "Google"){
    println("Searching for $search on $searchEngine")
}

fun alternatingSum(vararg numbers: Int): Int{
    var sum = 0
    for(i in 0 until numbers.size){
        if(i%2 == 0){
            sum += numbers[i]
        }
        else{
            sum-= numbers[i]
        }
    }
    return sum
}

fun Int.isPrime(): Boolean{ //EXTENSION FUNCTION
    for(i in 2 until this){
        if(this % i == 0){
            return false
        }
    }
    return true
}

fun List<Int>.whatTimes(): Int{
    var sum = 1
    for(i in 0 until this.size){
        sum*=this[i]
    }
    return sum
}

fun maxArea(shape1: Shape, shape2: Shape) : Double{
    val areaShape1 = shape1.area()
    val areaShape2 = shape2.area()
    return if (areaShape1 > areaShape2) areaShape1 else areaShape2
}
fun maxArea(shape1: Shape, shape2: Shape, shape3: Shape) : Double{
    val maxAreaShape1Shape2 = maxArea(shape1, shape2)
    val areaShape3 = shape3.area()
    return if (maxAreaShape1Shape2 > areaShape3) maxAreaShape1Shape2 else areaShape3
}

fun List<Int>.mySort(){
    var i = 0
    var j = this.size - 1
    var toggle = true
    println("List: $this")
    while (i <= j){
        if(toggle){
            println(this[i])
            i++
        }
        else{
            println(this[j])
            j--
        }
        toggle = !toggle
    }
}

fun Array<Int>.mySort(){
    var i = 0
    var j = this.size - 1
    var toggle = true
    println("Array: $this")
    while (i <= j){
        if(toggle){
            println(this[i])
            i++
        }
        else{
            println(this[j])
            j--
        }
        toggle = !toggle
    }
}

class DivisionByZeroException : Exception("You cannot divide by zero. Please choose different number.")

fun divide(a: Double, b: Double): Double{
    if(b == 0.0){
        throw DivisionByZeroException()
    }
    return a/b
}

fun List<Shape>.customFilter(filterFunction: (Shape, String) -> (Boolean)): List<Shape> {
    val resultList = mutableListOf<Shape>()
    for(shape in this){
        if(filterFunction(shape, "Hello")){
            resultList.add(shape)
        }
    }
    return resultList
}