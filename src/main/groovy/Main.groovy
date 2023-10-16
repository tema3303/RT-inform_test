static void main(String[] args) {
    def example = new Example()
    println(example.getMapSecond([1, 3, 4, 5, 1, 5, 4]))
    println(example.getMapSecond([1, 1, 2, 4, 1, 5, 6, 7, 8, 8, 9, 0]))
    println(example.getMapSecond([1]))
    println(example.getMapSecond([]))
}

class Example {
    def getMapSecond(collection) {
        return collection.collectEntries { [it, collection.count(it)] }
    }
}