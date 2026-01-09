package Bit_Manipulation;

public class CountSetBits {

    /*
     * Count the number of set bits in a number
     * e.g.
     * 5 - 101
     * 6 - 110
     * 7 - 111
     * 8 - 1000
     *
     * n & (n-1) will clear the rightmost set bit in n
     */
    public static int countsetbits(int n) {
        int count = 0;
        while (count < n) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countsetbits(7));
    }
}