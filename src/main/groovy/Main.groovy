static void main(String[] args) {
    def example = new Example()
    def arr = []
    Random rnd = new Random();
    for (int i = 0; i < 100000; i++) {
        arr.add(i, rnd.nextInt(10))
    }
    println(example.getMap([1, 3, 4, 5, 1, 5, 4]))
    println(example.getMap([1, 1, 2, 4, 1, 5, 6, 7, 8, 8, 9, 0]))
    println(example.getMap([1]))
    println(example.getMap([]))
    println(example.getMap(arr))
    println(example.getMap(null))
}

class Example {
    def getMap(collection) {
        if (collection == null) {
            println("Передан null")
            return null
        }
        def map = [:].withDefault { 0 }
        collection.each { it -> map[it]++ }
        return map
    }
}