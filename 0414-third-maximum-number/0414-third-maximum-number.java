class Solution {
    public int thirdMax(int[] arr) {
      int n = arr.length;
        long mx = Long.MIN_VALUE;
        long smx = Long.MIN_VALUE;
        long thrmx = Long.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(arr[i]>mx){
                thrmx = smx;
                smx = mx;
                mx = arr[i];
            }else if(arr[i]>smx && arr[i] != mx){
                thrmx = smx;
                smx = arr[i];
            }else if(arr[i]>thrmx && arr[i] != smx && arr[i]!= mx){
                thrmx = arr[i];
            }
        }
        if (thrmx == Long.MIN_VALUE) {
    return (int) mx;
}
return (int) thrmx;
    }
}