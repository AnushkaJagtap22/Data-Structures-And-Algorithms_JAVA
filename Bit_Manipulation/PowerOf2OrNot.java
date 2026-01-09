package Bit_Manipulation;

public class PowerOf2OrNot {
    /*
     * A number is a power of 2 if it has only one set bit in its binary
     * representation.
     * e.g.
     * 2 - 10
     * 4 - 100
     * 8 - 1000
     * 16 - 10000
     * 
     * n & (n-1) will be 0 for powers of 2
     */

    public static boolean isPowerOf2(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int n = 16;
        if (isPowerOf2(n)) {
            System.out.println(n + " is a power of 2");
        } else {
            System.out.println(n + " is not a power of 2");
        }
    }
}
