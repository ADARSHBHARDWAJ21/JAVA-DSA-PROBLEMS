import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a hash map to store the value and its corresponding index
        Map<Integer, Integer> map = new HashMap<>();
        
        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If the complement exists in the map, we found our pair
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, put the current element and its index into the map
            map.put(nums[i], i);
        }
        
        // Return an empty array if no solution is found (though constraints guarantee one exists)
        return new int[] {};
    }
}