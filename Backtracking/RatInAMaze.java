class RatInMaze {

    // Function to solve the maze problem
    public static boolean solveMaze(int[][] maze, int n) {

        // Solution matrix to store the path
        int[][] sol = new int[n][n];

        // Start from top-left corner (0,0)
        if (!solveMazeUtil(maze, 0, 0, sol, n)) {
            System.out.println("No path exists");
            return false;
        }

        // Print the solution path
        printSolution(sol, n);
        return true;
    }

    // Utility function using backtracking
    private static boolean solveMazeUtil(int[][] maze, int x, int y, int[][] sol, int n) {

        // If destination is reached
        if (x == n - 1 && y == n - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        // Check if current cell is safe
        if (isSafe(maze, x, y, n)) {

            // Mark the current cell as part of solution path
            sol[x][y] = 1;

            // Move right
            if (solveMazeUtil(maze, x, y + 1, sol, n))
                return true;

            // Move down
            if (solveMazeUtil(maze, x + 1, y, sol, n))
                return true;

            // Backtrack: unmark the cell
            sol[x][y] = 0;
            return false;
        }

        return false;
    }

    // Check whether the cell is valid and open
    private static boolean isSafe(int[][] maze, int x, int y, int n) {
        return (x >= 0 && x < n &&
                y >= 0 && y < n &&
                maze[x][y] == 1);
    }

    // Print the solution matrix
    private static void printSolution(int[][] sol, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Driver method
    public static void main(String[] args) {

        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        int n = 4;
        solveMaze(maze, n);
    }
}
