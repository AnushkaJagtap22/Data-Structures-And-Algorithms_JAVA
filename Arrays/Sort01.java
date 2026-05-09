public class Sort01 {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Two Pointer Approach
    // We will maintain two pointers, one at the beginning of the array and one at the end.
    // We will iterate through the array and if we find a 1 at the left pointer
    // and a 0 at the right pointer, we will swap them and move both pointers towards the center.
    // If we find a 0 at the left pointer, we will move the left pointer to the right.
    // If we find a 1 at the right pointer, we will move the right pointer
    // to the left.
    // This way, we will sort the array in a single pass.
    static int[] sort(int[] arr)
    {
        int n = arr.length;
        int i = 0 ;
        int j = n - 1;
        while(i < j)
        {
            if(arr[i] == 1 && arr[j] == 0)
            {  
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if(arr[i] == 0)
            {
                i++;
            }
            if(arr[j] == 1)
            {
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0};
        int[] sortedArr = sort(arr);
        for(int num : sortedArr)
        {
            System.out.print(num + " ");
        }
    }
}
