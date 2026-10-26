class Solution {
    public int maximumWealth(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int max  = 0;
        for(int i = 0; i<n; i++){
            int sum = 0;
            for(int j = 0; j<m; j++){
                sum += arr[i][j];
            }
            if(sum>max){
                max = sum;
            }
        }
            return max;
        }
    }
