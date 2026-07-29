public class Pattern12 {
    public static void main(String[] args) {
        int n = 4 ;
        for(int row = 1 ; row <= n ; row++)
        {
            for(int col = 1 ; col <= n - row ; col++)
            {
                System.out.print(" ");
            }
            if(row == 1)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print("*");
                for(int col = 1; col <= 2*row-3 ; col++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row = 1 ; row <=(n-1) ; row++)
        {
            for(int col = 1; col<= row ; col++)
            {
                System.out.print(" ");
            }
            if(row ==(n-1))
            {
                System.out.print("*");
            }
            else{
                System.out.print("*");
                for(int col = 1 ;col <= 2*(n-row)-3 ; col++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }   
}
