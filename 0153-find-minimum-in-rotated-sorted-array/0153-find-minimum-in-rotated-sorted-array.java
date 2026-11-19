import java.util.Arrays;
class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int min = arr[0];
        for(int i = 0; i<n; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}