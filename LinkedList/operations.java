package LinkedList;

public class operations {

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
    int size;

    // Add at beginning
    public void addFirst(int data) {
        Node n = new Node(data);
        size++;

        if (head == null) {
            head = tail = n;
            return;
        }

        n.next = head;
        head = n;
    }

    // Add at end
    public void addLast(int data) {
        Node n = new Node(data);
        size++;

        if (head == null) {
            head = tail = n;
            return;
        }

        tail.next = n;
        tail = n;
    }

    // Add at middle
    public void addMiddle(int idx, int data) {

        if (idx < 0 || idx > size) {
            System.out.println("Invalid index");
            return;
        }

        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node n = new Node(data);
        Node temp = head;
        size++;

        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        n.next = temp.next;
        temp.next = n;
    }

    // Remove first
    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }

        int val = head.data;

        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
        }

        size--;
        return val;
    }

    // Remove last
    public int removeLast() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // Print list
    public void print() {
        if (head == null) {
            System.out.println("LINKED LIST IS EMPTY");
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
        operations l = new operations();

        l.print();
        l.addFirst(1);
        l.print();
        l.addFirst(2);
        l.print();
        l.addMiddle(2, 9);
        l.print();
        l.addLast(3);
        l.print();
        l.addLast(4);
        l.print();
        System.out.println("Size = " + l.size);
        l.removeFirst();
        l.print();
        l.removeLast();
        l.print();
    }
}
