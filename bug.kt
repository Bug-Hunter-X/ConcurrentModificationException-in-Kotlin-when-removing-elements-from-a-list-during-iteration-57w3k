fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    set.removeIf { it > 2 }
    println(set) // Output: [1, 2]

    // ConcurrentModificationException
    val list2 = mutableListOf(1, 2, 3, 4, 5)
    for (item in list2) {
        if (item > 2) {
            list2.remove(item)
        }
    }
    println(list2) // Throws ConcurrentModificationException
}