public class Pattern4 {
    public static void main(String[] args) {
        int n = 5 ;
        for(int row = 1 ; row <= n ; row++)
        {
            //spaces
            for(int col = 1 ; col <= n - row ; col ++)
            {
                System.out.print(" ");
            }
            //stars
            for(int col = 1 ; col <= n ; col ++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }    
}
