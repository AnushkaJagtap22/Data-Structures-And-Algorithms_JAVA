import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(100);
        set.add(200);
        set.add(300);

        System.out.println(set);
    }
}