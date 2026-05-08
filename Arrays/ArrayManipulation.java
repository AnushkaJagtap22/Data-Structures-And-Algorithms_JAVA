public class ArrayManipulation {
    // Reverse an array
    static void reverseArray(int[] arr)
    {
        int n = arr.length;
        int i = 0 ;
        int j = n-1;
        while(i <= j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int k : arr)
        {
            System.out.print(k + " ");
        }
    }
    //Shift all elements by one position to the right
    static void shiftRight(int arr[])
    {
        int n = arr.length;
        int last = arr[n-1];
        for(int i = n-1 ; i > 0 ; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        for(int k : arr)        {
            System.out.print(k + " ");
        }
    } 
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Original Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        // Reverse the array
        System.out.println("\nReversed Array: ");
        reverseArray(arr);
        // Shift right
        System.out.println("\nShifted Right Array: ");
        shiftRight(arr);
    }
}
