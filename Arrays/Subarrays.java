public class Subarrays {
    public static void printSubArrays(int num[]) {
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(num[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };
        System.out.println("Subarrays in the array:");
        printSubArrays(num);
    }
}
