class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int min = arr[0];
        int maxProfit = 0;
        for(int i = 0; i<n; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]-min > maxProfit){
                maxProfit = arr[i] - min;
            
            }
        }
        return maxProfit;
    }}
    
    
