open class Car(
    var model: String,
    var type: String,
    var horsePower: Int
) {
    init {
        println("$model has been started...")
        println("The $model's type is $type")
        println("The $model's horse power is $horsePower")
    }


}