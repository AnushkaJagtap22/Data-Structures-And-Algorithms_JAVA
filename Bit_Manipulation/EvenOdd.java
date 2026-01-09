package Bit_Manipulation;

public class EvenOdd {
    /*
     * 0 - 000
     * 1 - 001
     * 2 - 010
     * 3 - 011
     * 4 - 100
     * 5 - 101
     * 6 - 110
     * 
     * Even numbers have their last bit as 0
     * Odd numbers have their last bit as 1
     */

    public static void evenodd(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        evenodd(4);
        evenodd(7);
    }
}
