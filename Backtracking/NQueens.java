class NQueens {

    // Main function to initialize the board and start solving
    public static void solveNQueens(int n) {

        // Create an n x n chessboard
        char[][] board = new char[n][n];

        // Initialize the board with '.' indicating empty cells
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        // Start placing queens from row 0
        placeQueen(0, board, n);
    }

    // Recursive function to place queens row by row
    private static void placeQueen(int row, char[][] board, int n) {

        // Base case: if all rows are filled, print the solution
        if (row == n) {
            printBoard(board, n);
            System.out.println(); // separate multiple solutions
            return;
        }

        // Try placing a queen in each column of the current row
        for (int col = 0; col < n; col++) {

            // Check if placing queen at (row, col) is safe
            if (isSafe(row, col, board, n)) {

                // Place the queen
                board[row][col] = 'Q';

                // Recur to place queen in next row
                placeQueen(row + 1, board, n);

                // Backtrack: remove the queen
                board[row][col] = '.';
            }
        }
    }

    // Function to check whether a queen can be placed at (row, col)
    private static boolean isSafe(int row, int col, char[][] board, int n) {

        // Check for another queen in the same column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'Q')
                return false;
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n;
             i--, j++) {

            if (board[i][j] == 'Q')
                return false;
        }

        // Safe to place queen
        return true;
    }

    // Function to print the current board configuration
    private static void printBoard(char[][] board, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    // Driver method
    public static void main(String[] args) {
        int n = 4; // Number of queens
        solveNQueens(n);
    }
}