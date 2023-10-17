import java.util.HashMap;

public class ExampleJava {
    HashMap<Integer, Integer> getHashMap(int[] array) {
        try {
            HashMap<Integer, Integer> result = new HashMap<>();
            for (int e : array) {
                if (!result.containsKey(e)) {
                    result.put(e, 1);
                } else {
                    result.put(e, result.get(e) + 1);
                }
            }
            return result;
        } catch (NullPointerException e) {
            System.out.println("Передан null");
            return null;
        }
    }
}