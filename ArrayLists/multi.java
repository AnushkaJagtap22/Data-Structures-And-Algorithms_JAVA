package ArrayLists;

import java.util.ArrayList;

public class multi {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> main = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        main.add(a1);
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(30);
        a2.add(40);
        main.add(a2);
        for(int i = 0 ; i < main.size() ; i++)
        {
            ArrayList<Integer> curr = main.get(i);
            for(int j = 0 ; j < curr.size() ; j ++)
            {
                System.out.println(curr.get(j)+" ");
            }
            System.out.println();
        }
    }
}
