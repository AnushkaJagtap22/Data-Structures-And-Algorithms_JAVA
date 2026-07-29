public class Pattern11 {
    public static void main(String[] args) {
        int n = 4 ; 
        for(int row = 1 ; row <= n ; row++)
        {
            // part 1 
            for(int col = 1 ; col <= n-row ; col++)
            {
                System.out.print(" ");
            }
            for(int col =1 ; col<= 2*row-1 ; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row = 1 ; row <= n ; row++)
        {
            // part 2
            if(row == 1)
            {
                continue;
            }
            for(int col = 1 ; col <= row-1 ; col++)
            {
                System.out.print(" ");
            }
            for(int col =1 ; col<= 2*n-2*row+1 ; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
