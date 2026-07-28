public class Pattern8 {
    public static void main(String[] args) {
        int n = 4; 
        for(int row = 1 ; row <= n ; row ++)
        {
            for(int col = 1 ; col <=6 ; col ++)
            {
                // first and last column - 6 stars
                if(row == 1 || row == n)
                {
                    System.out.print("*");
                }
                //remaining 
                else
                {
                    if(col == 1)
                    {
                        System.out.print("*");
                    }
                    else if(col == 6)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
