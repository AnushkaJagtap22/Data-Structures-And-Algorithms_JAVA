import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "Mango");
        map.put(1, "Apple");
        map.put(2, "Banana");

        System.out.println(map);
    }
}