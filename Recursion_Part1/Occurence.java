package Recursion_Part1;

public class Occurence {
    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
    }

    public static int lastOccurence(int arr[], int key, int i) {
        if (i == -1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return lastOccurence(arr, key, i - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 2, 5, 2, 6 };
        int key = 2;
        System.out.println("First Occurrence of " + key + " is at index: " + firstOccurence(arr, key, 0));
        System.out.println("Last Occurrence of " + key + " is at index: " + lastOccurence(arr, key, arr.length - 1));
    }
}
