package Recursion_Part2;

public class TilingProblem {
    /*
     * Given a 2 x n board and tiles of size 2 x 1,
     * count the number of ways to tile the given board using the 2 x 1 tiles.
     */
    public static int tilingWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // vertical placement
        int verticalWays = tilingWays(n - 1);
        // horizontal placement
        int horizontalWays = tilingWays(n - 2);

        return verticalWays + horizontalWays;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Number of ways to tile a 2 x " + n + " board is: " + tilingWays(n));
    }
}
