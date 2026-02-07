package ArrayLists;

import java.util.ArrayList;

public class reverse {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println("Array List : "+arr);
        System.out.println("Reverse :");
        for(int i = arr.size()-1;i>=0;i--)
        {
            System.out.println(arr.get(i) + " ");
        }
    }
}
