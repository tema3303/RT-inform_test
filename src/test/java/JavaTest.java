import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaTest {
    ExampleJava exampleJava = new ExampleJava();

    @Test
    public void getHashMapTest() {
        int[] arr = new int[]{1, 1, 1};
        int[] arr2 = new int[]{1, 2, 3};
        int[] arr3 = new int[]{1, 2, 2, 3, 3, 1};
        assertAll(
                () -> assertEquals(Map.of(1, 3), exampleJava.getHashMap(arr), "Тест не прошел"),
                () -> assertEquals(Map.of(1, 1, 2, 1, 3, 1), exampleJava.getHashMap(arr2), "Тест не прошел"),
                () -> assertEquals(Map.of(1, 2, 2, 2, 3, 2), exampleJava.getHashMap(arr3), "Тест не прошел")
        );
    }
}