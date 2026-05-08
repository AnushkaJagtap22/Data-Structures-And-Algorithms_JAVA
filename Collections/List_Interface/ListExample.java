import java.util.*;

public class ListExample {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("List Elements: " + fruits);

        System.out.println("First Element: " + fruits.get(0));

        fruits.set(1, "Orange");

        System.out.println("Updated List: " + fruits);

        fruits.remove("Apple");

        System.out.println("After Removal: " + fruits);
    }
}