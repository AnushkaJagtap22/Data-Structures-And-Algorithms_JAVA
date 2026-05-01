public class SecondLargest {

    public static int SecondLargest(int arr[])
    {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int result = SecondLargest(arr);
        if (result == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element in the array.");
        } else {
            System.out.println("The second largest element in the array is: " + result);
        }
    }
}
