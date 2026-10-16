class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int rev = 0;
        while(x>0){
            int lasd = x%10;
            rev = rev*10+lasd;
            x = x/10;
        }
        if (rev == temp){
            IO.println("Palindromic number");
        }else{
            IO.println("Not a palindromic number");
        }
        return rev == temp;
    
}
}