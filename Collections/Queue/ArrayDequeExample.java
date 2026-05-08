import java.util.*;

public class ArrayDequeExample {
    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.offer(10);
        deque.offerFirst(5);
        deque.offerLast(20);

        System.out.println(deque);

        deque.pollFirst();

        System.out.println("After Poll First: " + deque);
    }
}