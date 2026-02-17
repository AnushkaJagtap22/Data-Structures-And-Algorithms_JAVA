package LinkedList;

public class palindrome {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find the middle of the linked list
        Node mid = findMid(head);

        // Step 2: Reverse the second half of the linked list
        Node prev = null;
        Node curr = mid;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Compare the first half and the reversed second half
        Node left = head;
        Node right = prev; // This is the head of the reversed second half

        while (right != null) {
            if (left.data != right.data) {
                return false; // Not a palindrome
            }
            left = left.next;
            right = right.next;
        }

        return true; // It's a palindrome
    }
    public static void main(String[] args) {
        palindrome l = new palindrome();

        l.head = new Node(1);
        l.head.next = new Node(2);
        l.head.next.next = new Node(3);
        l.head.next.next.next = new Node(2);
        l.head.next.next.next.next = new Node(1);

        System.out.println(l.isPalindrome()); // Output: true
    }
}
 