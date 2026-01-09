package Bit_Manipulation;

public class Operations {
    /*
     * Operations on bits
     * get ith bit - check if the bit at position i is set (1) or not (0) - n & (1
     * << i)
     * set ith bit - to set the bit at position i to 1 - n | (1 << i)
     * clear ith bit - to set the bit at position i to 0 - n & ~(1 << i)
     * update ith bit - to update the bit at position i to v (0 or 1) - clear the
     * bit and then set it if v is 1 - n = n & ~(1 << i) | (v << i)
     */
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n | bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
    }

    public static void clearLastBit(int n, int i) {
        int bitMask = (~0) << i;
        System.out.println(n & bitMask);
    }

    public static void clearRangeOfBit(int n, int i) {
        int bitMask = (~0) << i;
        System.out.println(n & bitMask);
    }

    public static void main(String[] args) {
        int n = 5; // 0101
        int i = 2;
        System.out.println("The " + i + "th bit of " + n + " is: " + getIthBit(n, i));
        System.out.println("After setting the " + i + "th bit of " + n + ": " + setIthBit(n, i));
        System.out.println("After clearing the " + i + "th bit of " + n + ": " + clearIthBit(n, i));
        int newBit = 1;
        System.out.println(
                "After updating the " + i + "th bit of " + n + " to " + newBit + ": " + updateIthBit(n, i, newBit));
        System.out.print("After clearing the last " + i + " bits of " + n + ": ");
        clearLastBit(n, i);
        System.out.print("After clearing the bits from " + i + " to " + i + " of " + n + ": ");
        clearRangeOfBit(n, i);
    }
}
