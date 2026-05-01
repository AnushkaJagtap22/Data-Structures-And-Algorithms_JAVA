public class rotate {
    public static void rotateArray(int arr[] , int d)
    {
        int n = arr.length;
        reversearray(arr,0,d-1);
        reversearray(arr,d,n-1);
        reversearray(arr,0,n-1);        
    }
    public static void reversearray(int arr[] , int start , int end)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int d = 2;
        rotateArray(arr, d);
        System.out.println("Rotated array:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
