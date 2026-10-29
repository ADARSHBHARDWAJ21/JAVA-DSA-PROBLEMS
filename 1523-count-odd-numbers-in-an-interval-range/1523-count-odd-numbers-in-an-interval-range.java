class Solution {
    public int countOdds(int low, int high) {
            int total = (high -low) /2;

            if(low%2 != 0 || high%2 != 0){
                return total + 1;
            }
            return total;
        }
    }
