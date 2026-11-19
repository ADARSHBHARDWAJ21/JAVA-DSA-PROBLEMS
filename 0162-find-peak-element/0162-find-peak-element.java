class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        int mx = 0;
        for(int i = 1; i<n; i++){
            if(arr[i]>arr[mx]){
                mx = i;
            }
        }
        return mx;
    }
}