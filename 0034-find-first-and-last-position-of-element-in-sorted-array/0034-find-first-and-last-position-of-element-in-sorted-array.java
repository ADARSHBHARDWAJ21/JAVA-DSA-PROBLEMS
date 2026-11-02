class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        
        // 1. Find First Position
        int fp = -1;
        int lo = 0;
        int hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                fp = mid;
                hi = mid - 1; // Search left for first occurrence
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        
        // 2. Find Last Position
        int lp = -1;
        lo = 0;
        hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                lp = mid;
                lo = mid + 1; // Search right for last occurrence
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        
        ans[0] = fp;
        ans[1] = lp;
        return ans;
    }
}