package ArrayLists;

import java.util.ArrayList;

public class ContainerWithMostWater {
    // FlipKart
    //For a given n lines on x axis , use 2 lines to form a container such that it holds maximum water
    //height = [1,8,6,2,5,4,8,3,7]
    public static int storeWater(ArrayList<Integer> height)
    {
        int max = 0 ;
        int lp = 0 ;
        int rp = height.size()-1;
        while(lp<rp)
        {
            int ht = Math.min(height.get(lp),height.get(rp));
            int wt = rp -lp;
            int curr = ht * wt;
            max = Math.max(max,curr);

            if(height.get(lp) < height.get(rp))
            {
                lp++;
            }
            else{
                rp--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height));
    }
}
