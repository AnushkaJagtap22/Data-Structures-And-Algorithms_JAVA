package ArrayLists;

import java.util.ArrayList;

public class operations {
    public static void main(String[] args) {
            ArrayList<Integer> arr = new ArrayList<>();
            // Add elements
            arr.add(1);
            arr.add(2);
            arr.add(3);
            arr.add(4);
            arr.add(5);
            System.out.println("Array elements : " + arr);

            //get operation
            int element = arr.get(2);
            System.out.println(element);

            //remove operation
            arr.remove(4);
            System.err.println(arr);

            //set operation
            arr.set(2,2);
            System.out.println(arr);

            //contains operation
            System.out.println(arr.contains(1));
            System.out.println(arr.contains(11));

    }    
}
