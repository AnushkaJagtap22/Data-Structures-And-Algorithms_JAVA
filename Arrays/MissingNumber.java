public class MissingNumber {
    static int missing(int arr[])
    {
        int xor = 0;
        int n = arr.length;
        // XOR of all the elements in the array
        for(int i = 0; i < n; i++)
        {
            xor = xor ^ arr[i];
        }
        // XOR of all the numbers from 1 to n+1
        for(int i = 1; i <= n + 1; i++)
        {
            xor = xor ^ i;
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int missingNumber = missing(arr);
        System.out.println("The missing number is: " + missingNumber);
    }   
}
