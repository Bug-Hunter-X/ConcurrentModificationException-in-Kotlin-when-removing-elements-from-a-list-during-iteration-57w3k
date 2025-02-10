fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    // Safe way to remove elements using removeIf
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    val list2 = mutableListOf(1, 2, 3, 4, 5)
    // Safe way to remove elements by iterating in reverse
    for (i in list2.size - 1 downTo 0) {
        if (list2[i] > 2) {
            list2.removeAt(i)
        }
    }
    println(list2) // Output: [1, 2]
    
    val list3 = mutableListOf(1,2,3,4,5)
    val newList = list3.filter { it <= 2 }
    println(newList) // Output: [1,2]
}