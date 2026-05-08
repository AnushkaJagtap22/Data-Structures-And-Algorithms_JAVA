import java.util.*;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println(queue);

        queue.remove();

        System.out.println("After Removal: " + queue);

        System.out.println("Front Element: " + queue.peek());
    }
}