import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        names.add("Anushka");
        names.add("Riya");
        names.add("Aarush");
        names.add("Anushka");

        System.out.println(names);
    }
}