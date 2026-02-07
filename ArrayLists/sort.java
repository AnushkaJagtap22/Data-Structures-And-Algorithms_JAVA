package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class sort {
    public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
        arr.add(11);
        arr.add(22);
        arr.add(8);
        arr.add(2);
        arr.add(5);
        System.out.println(arr);
        Collections.sort(arr); // ascending
        System.out.println(arr);
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr);
}
}
