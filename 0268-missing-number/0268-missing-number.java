class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum += arr[i];
        }
        int actualnum = (n*(n+1)/2);
        int misssingnum = actualnum - sum;
         return misssingnum;   
    }

}