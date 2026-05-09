import java.util.HashMap;
import java.util.Map;

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
    // Print Extreme alternating elements
    static void printExtremeAlternating(int arr[])
{
    int n = arr.length;

    int i = 0;
    int j = n - 1;

    while(i <= j)
    {
        if(i == j)
        {
            System.out.println(arr[i]);
        }
        else
        {
            System.out.println(arr[i]);
            System.out.println(arr[j]);
        }

        i++;
        j--;
    }
}
    //Most frequently occurring element - Mode
    static int findMode(int arr[]) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr)
        {
            map.put(i , map.getOrDefault(i, 0) + 1);
        }
        int mode = arr[0];
        int maxCount = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() > maxCount)
            {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }
        return mode;
    }

    // Driver code
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
        // Print Extreme alternating elements
        System.out.println("\nExtreme Alternating Elements: ");
        printExtremeAlternating(arr);
        // Find mode        
        int arr2[] = {1, 2, 3, 4, 5, 2, 3, 2};
        System.out.println("\nMode of the array: " + findMode(arr2));
    }
}