import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("ArrayList: " + numbers);

        System.out.println("Element at index 2: " + numbers.get(2));

        numbers.remove(1);

        System.out.println("After Removal: " + numbers);

        for(Integer num : numbers) {
            System.out.println(num);
        }
    }
}