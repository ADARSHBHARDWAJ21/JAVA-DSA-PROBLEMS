class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int noofzeroes = 0;
        int noofones = 0;
        int nooftwos = 0;
        
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                noofzeroes++; 
            } else if(arr[i] == 1){
                noofones++;
            } else {
                nooftwos++;
            }
        }
        
        for(int i = 0; i < noofzeroes; i++){
            arr[i] = 0;
        }
        
        for(int i = noofzeroes; i < noofzeroes + noofones; i++){
            arr[i] = 1;
        }
        
        for(int i = noofones + noofzeroes; i < n; i++){
            arr[i] = 2;
        }
    }
}