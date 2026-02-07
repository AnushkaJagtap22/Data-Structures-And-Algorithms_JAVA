package ArrayLists;

import java.util.ArrayList;

public class max {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(11);
        arr.add(22);
        arr.add(8);
        arr.add(2);
        arr.add(5);
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.size() ; i++)
        {
            if(arr.get(i) > max)
            {
                max = arr.get(i);
            }
        }
        System.out.println("Maximum element : " + max);
    }
}
