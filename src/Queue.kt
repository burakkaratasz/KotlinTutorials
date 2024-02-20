class Queue<T> {
    private val elements = mutableListOf<T>()

    fun push(item: T){
        elements.add(item)
    }

    fun remove(): T?{
        if (elements.isNotEmpty()){
            return elements.removeAt(0)
        }
        return null
    }
}