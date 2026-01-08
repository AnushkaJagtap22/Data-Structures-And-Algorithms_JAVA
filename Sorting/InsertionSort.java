package Sorting;

public class InsertionSort {
    public static void intsertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 2, 3 };

        intsertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
