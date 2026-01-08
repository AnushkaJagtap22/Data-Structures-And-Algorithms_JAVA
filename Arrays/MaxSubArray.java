public class MaxSubArray {
    public static void printMaxSubArrays(int num[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // bruteforce approach
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += num[k];
                }
                System.out.println("Current Subarray Sum: " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
    }

    public static void printMaxSubArraysPrefix(int num[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];
        // prefix sum approach

        prefix[0] = num[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }

        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

    public static void kadanes(int[] num) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            cs = cs + num[i];
            ms = Math.max(ms, cs);

            if (cs < 0) {
                cs = 0;
            }
        }
        System.out.println("Maximum Subarray Sum using Kadane's: " + ms);
    }

    public static void main(String[] args) {
        int num[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // printMaxSubArrays(num);
        // printMaxSubArraysPrefix(num);
        kadanes(num);

    }
}
