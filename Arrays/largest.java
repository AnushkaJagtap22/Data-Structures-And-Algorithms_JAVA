public class largest {
    public static int findLargest(int arr[]) {
        int largest = Integer.MIN_VALUE; // -inifinity
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 45, 67, 23, 89, 12 };
        int largestNumber = findLargest(numbers);
        System.out.println("The largest number in the array is: " + largestNumber);
    }
}
