public class SearchSortedMatrix {
    public static boolean search(int matrix[][], int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int r = 0, c = cols - 1;

        while (r < rows && c >= 0) {
            if (matrix[r][c] == target) {
                return true;
            } else if (matrix[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 50 }
        };
        int target = 3;
        System.out.println("Element " + target + " found: " + search(matrix, target));
    }

}
