package Recursion_Part2;

class UniquePath {

    public static int unique(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        return unique(m - 1, n) + unique(m, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(unique(3, 3));
    }
}
