import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        
        return ans;
    }
}