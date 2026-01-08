package Sorting;

import java.util.Arrays;

public class Inbuilt {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 2, 3 };

        Arrays.sort(arr); // inbuilt sort

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
