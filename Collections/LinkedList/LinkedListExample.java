import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();

        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Delhi");

        cities.addFirst("Nagpur");
        cities.addLast("Bangalore");

        System.out.println(cities);

        cities.removeFirst();

        System.out.println("After Removing First: " + cities);
    }
}