public class MainJava {
    public static void main(String[] args) {
        ExampleJava exampleJava = new ExampleJava();
        System.out.println(exampleJava.getHashMap(new int[]{1, 3, 4, 5, 1, 5, 4}));
        System.out.println(exampleJava.getHashMap(new int[]{1}));
        System.out.println(exampleJava.getHashMap(new int[]{1, 1, 2, 4, 1, 5, 6, 7, 8, 8, 9, 0}));
        System.out.println(exampleJava.getHashMap(new int[]{}));
    }
}