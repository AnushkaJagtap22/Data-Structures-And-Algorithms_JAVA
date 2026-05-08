import java.util.*;

public class VectorExample {
    public static void main(String[] args) {

        Vector<String> subjects = new Vector<>();

        subjects.add("Java");
        subjects.add("Python");
        subjects.add("C++");

        System.out.println(subjects);

        System.out.println("Capacity: " + subjects.capacity());

        subjects.remove("Python");

        System.out.println("After Removal: " + subjects);
    }
}