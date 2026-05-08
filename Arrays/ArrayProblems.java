public class ArrayProblems {
    // Problem: Calculate the average of an array of integers
    static double getAverage(int[] arr)
    {
        int sum = 0 ;
        for(int i : arr)
        {
            sum += i;
        }
        int size = arr.length;
        return (double) sum / size;
    }
    // Problem: Multiply each element of an array by 10 and return a new array
    static int[] multiplyBy10(int[] arr)
    {
        int size = arr.length;
        int newArr[] = new int[size];
        for(int i = 0 ; i < size ; i++)
        {
            int element = arr[i];
            int newElement = element * 10 ;
            newArr[i] = newElement;
        }
        return newArr;
    }
    //Search for an element in an array and return its index, or -1 if not found(Linear Search)
    static int search(int[] arr , int target)
    {
        int n = arr.length;
        for(int i = 0 ; i < n ; i++)
        {
            if(arr[i] == target)
            {
                return i;
            }

        }
        return -1;
    }

    //Find maximum in an array
    static int findMax(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i : arr)
        {
            if(i > max)
            {
                max = i;
            }
        }
        return max; 
    }

    //Find sum of positive and negative numbers in an array
    static void sumPositiveNegative(int[] arr)
    {
        int positive = 0 ;
        int negative = 0 ;
        for(int i : arr)
        {
            if(i > 0)
            {
                positive += i;
            }
            else if(i < 0)
            {
                negative += i;
            }
        }
        System.out.println("Sum of positive numbers: " + positive);
        System.out.println("Sum of negative numbers: " + negative);
    }
    //Count the number of 0's and 1's in a binary array
    static void countZeroesOnes(int[] arr)
    {
        int zeros = 0 ;
        int ones = 0;
        for(int i : arr)
        {
            if(i == 0)
            {
                zeros++;
            }
            else if(i == 1)
            {
                ones++;
            }
        }
        System.out.println("Number of 0's: " + zeros);
        System.out.println("Number of 1's: " + ones);
    }
    // Find first unsorted element in an array
    static int findFirstUnsorted(int[] arr)
    {
        int n = arr.length;
        for(int i = 0 ; i < n - 1 ; i ++)
        {
            if(arr[i] > arr[i+1])
                {
                    return arr[i];
                }
        }
        return -1;
    }
    // Main method to test the above functions
    public static void main(String args[])
    {
        int[] arr = {10, 20, 30, 40, 50};
        // Calculate and print the average of the array
        double average = getAverage(arr);
        System.out.println("Average: " + average);
        // Multiply each element by 10 and print the new array
        System.out.println("Product: ");
        for(int i : multiplyBy10(arr))
        {
            System.out.print(i + " ");
        }
        System.out.println();
        // Search for an element and print the result
        System.out.println("Searching for an element");
        System.out.println(search(arr, 30));
        // Find and print the maximum element in the array
        System.out.println("Maximum: " + findMax(arr));
        // Calculate and print the sum of positive and negative numbers
        int[] arr2 = {10, -5, 20, -15, 30, -25};
        sumPositiveNegative(arr2);
        // Count and print the number of 0's and 1's in a binary array
        int[] arr3 = {0, 1, 0, 1, 1, 0};
        countZeroesOnes(arr3);
        // Find and print the first unsorted element in an array
        int[] arr4 = {10, 20, 30, 25, 40, 50};
        System.out.println("First Unsorted Element: " + findFirstUnsorted(arr4));
    }
}
