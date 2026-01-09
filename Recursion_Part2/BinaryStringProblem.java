package Recursion_Part2;

public class BinaryStringProblem {
    public static void generateBinaryStrings(int n, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        generateBinaryStrings(n - 1, str + "0");
        generateBinaryStrings(n - 1, str + "1");
    }

    public static void main(String[] args) {
        int n = 3; // Length of binary strings
        generateBinaryStrings(n, "");
    }
}
