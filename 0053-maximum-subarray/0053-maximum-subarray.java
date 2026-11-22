class Solution {
    public int maxSubArray(int[] arr) {
        int n = arr.length;
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            currentsum += arr[i];
            maxsum = Math.max(maxsum , currentsum);
            if(currentsum<0){
                currentsum = 0;
            }
        }
        return maxsum;
        
    }
}