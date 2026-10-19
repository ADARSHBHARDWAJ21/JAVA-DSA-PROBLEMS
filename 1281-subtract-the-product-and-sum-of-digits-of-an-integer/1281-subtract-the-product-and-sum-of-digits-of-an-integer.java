class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int prd = 1;
        while(n > 0){
            int digith = n%10;
             sum += digith;
             prd *= digith;
             n = n/10;
        }
      
      return prd - sum;   
    }
     
}