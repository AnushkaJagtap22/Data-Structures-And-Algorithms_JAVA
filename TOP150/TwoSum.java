// Amazon - 108 Apple - 43 Google - 39 Facebook - 22 Bloomberg 13

package TOP150;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        int n = nums.length;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i+1 ; j < n ; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    return new int[] {i,j};
                }
            }
        }   
        return new int[]{};
    }
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = ts.twoSum(nums, target);
        if(result.length == 2)
        {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }
        else
        {
            System.out.println("No two sum solution found.");
        }
    }
}
