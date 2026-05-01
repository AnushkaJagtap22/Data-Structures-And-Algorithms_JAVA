import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a hashmap to store numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if complement exists
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Store number with index
            map.put(nums[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();  // ✅ FIX HERE

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two sum solution found.");
        }
    }
}