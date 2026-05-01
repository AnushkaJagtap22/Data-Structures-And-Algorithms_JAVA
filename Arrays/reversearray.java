public class reversearray {
    public static void reversedarray(int arr[]) {
        int n = arr.length;
        int i = 0 ;
        int j = n-1;
        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        reversedarray(arr);
        System.out.println("Reversed array:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
