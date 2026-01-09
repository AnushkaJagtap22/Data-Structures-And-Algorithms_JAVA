package Recursion_Part1;

public class xToPowern {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static int optimizedPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(x, n / 2);
        if (n % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return x * halfPower * halfPower;
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(x + " to the power of " + n + " is: " + power(x, n));
        System.out.println(x + " to the power of " + n + " using optimized method is: " + optimizedPower(x, n));
    }
}
