public class Unique {
    static int findUnique(int arr[])
    {
        int xor = 0;
        for(int num : arr)
        {
            xor = xor ^ num;
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 3};
        int unique = findUnique(arr);
        System.out.println("The unique element is: " + unique);
    }
}
