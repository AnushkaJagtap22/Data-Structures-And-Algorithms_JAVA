package LinkedList;

public class search {

    // Node class
    static class Node {
        int data;
        Node next;
        Node(int data) {

            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    // Add at end (helper for testing)
    public void addLast(int data) {
        Node n = new Node(data);

        if (head == null) {
            head = tail = n;
            return;
        }

        tail.next = n;
        tail = n;
    }

    // Iterative search
    public int iterate(int key) {
        Node temp = head;
        int idx = 0;

        while (temp != null) {
            if (temp.data == key) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    // Main method
    public static void main(String[] args) {
        search l = new search();

        l.addLast(10);
        l.addLast(20);
        l.addLast(30);
        l.addLast(40);

        System.out.println(l.iterate(30)); // 2
        System.out.println(l.iterate(50)); // -1
    }
}
