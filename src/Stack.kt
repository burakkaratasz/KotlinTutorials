class Stack<T> {
    private val elements = mutableListOf<T>()

    fun push(item: T){
        elements.add(item)
    }

    fun pop(): T?{
        if(elements.isNotEmpty()){
            return elements.removeAt(elements.size - 1)
        }
        return null
    }


}