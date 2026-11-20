class Solution {
    public char findTheDifference(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        boolean[] used = new boolean[sChars.length];

        for (int i = 0; i < tChars.length; i++) {
            boolean found = false;
            for (int j = 0; j < sChars.length; j++) {
                if (!used[j] && tChars[i] == sChars[j]) {
                    used[j] = true;
                    found = true;
                    break;
                }
            }
            if (!found) {
                return tChars[i];
            }
        }
        return ' ';
    }
}
        
    