class Solution {
    public boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        boolean isPalindrome = true;
        
        while (i < j) {
            // 1. Skip non-alphanumeric characters from the left
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                i++;
            } 
            // 2. Skip non-alphanumeric characters from the right
            else if (!Character.isLetterOrDigit(str.charAt(j))) {
                j--;
            } 
            // 3. Compare valid characters ignoring case
            else {
                if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
                    isPalindrome = false;
                    break;
                }
                i++;
                j--;
            }
        }
        
        if (isPalindrome) {
            return true;
        } else {
            return false;
        }
    }
}