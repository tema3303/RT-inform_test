import org.junit.jupiter.api.Test

class GroovyTest {
    def example = new Example();

    @Test
    void getHashMapTest() {
        def arr = [1, 1, 1]
        def arr2 = [1, 2, 3]
        def arr3 = [1, 2, 2, 3, 3, 1]
        assert example.getMap(arr) == [1: 3]
        assert example.getMap(arr2) == [1: 1, 2: 1, 3: 1]
        assert example.getMap(arr3) == [1: 2, 2: 2, 3: 2]
    }
}