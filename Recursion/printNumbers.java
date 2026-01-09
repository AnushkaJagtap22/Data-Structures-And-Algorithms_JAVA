package Recursion;

public class printNumbers {
    public static void dec(int n) {
        if (n == 0) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        dec(n - 1);
    }

    public static void inc(int n) {
        if (n == 0) {
            System.out.println(n);
            return;
        }
        inc(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 5;
        dec(n);
        inc(n);
    }
}
