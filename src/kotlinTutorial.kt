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

    val numbers = listOf(1,2,3,4,5)
    val result = searchList(numbers, 3)
    println(result)

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

