class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder arr3 = new StringBuilder();
        int n = word1.length();
        int m = word2.length();
        int i = 0;
        while(i<n || i<m){
          if (i < n) {
        arr3.append(word1.charAt(i));
    }

    if (i < m) {
        arr3.append(word2.charAt(i));
    }
    i++;
        }
        return arr3.toString();
        
    }
}