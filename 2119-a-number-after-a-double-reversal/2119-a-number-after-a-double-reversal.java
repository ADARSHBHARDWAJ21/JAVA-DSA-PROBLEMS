class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp = num;
     for(int k = 0; k<2; k++){
        int rev = 0;
        while(num>0){
            int lastdigith = num%10;
            rev = rev*10 + lastdigith;
            num = num/10;
        }
        num = rev;
     }
     return num == temp;
    }
}