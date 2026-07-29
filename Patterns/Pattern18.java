

public class Pattern18 {
    public static void main(String[] args) {
        int n = 4;
        for(int row = 1; row<= n ; row++)
        {
            for(int col = 1 ; col<=n-row ;col++)
            {
                System.out.print(" ");
            }
            for(int col = 1 ; col<= row ;col++)
            {
                System.out.print(col);
            }
            int dec= row-1;
            for(int col = 1 ; col<=row-1 ; col++)
            {
                System.out.print(dec);
                dec--;
            }
            System.out.println();
        }
    }
}
