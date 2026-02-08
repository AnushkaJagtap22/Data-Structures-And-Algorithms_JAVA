package LinkedList;

public class reverse {
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

    // Add at end (for testing)
    public void addLast(int data) {
        Node n = new Node(data);

        if (head == null) {
            head = tail = n;
            return;
        }

        tail.next = n;
        tail = n;
    }

    // Reverse Linked List (Iterative)
    public void reverseList() {
        Node prev = null;
        Node curr = head;
        tail = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Print Linked List
    public void print() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main
    public static void main(String[] args) {
        reverse l = new reverse();

        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        l.addLast(4);

        l.print();        // 1 -> 2 -> 3 -> 4 -> null
        l.reverseList();
        l.print();        // 4 -> 3 -> 2 -> 1 -> null
    }
}

