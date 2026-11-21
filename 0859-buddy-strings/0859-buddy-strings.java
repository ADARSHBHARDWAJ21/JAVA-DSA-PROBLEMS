class Solution {
    public boolean buddyStrings(String str, String goal) {
        if (str.length() != goal.length()) return false;
        if (str.equals(goal)) {
            int[] count = new int[26];
            for (char c : str.toCharArray()) {
                if (++count[c - 'a'] > 1) return true;
            }
            return false;
        }

        StringBuilder sb = new StringBuilder();
        char[] arr1 = str.toCharArray();
        int n = arr1.length;
        int i = 0;
        int j = n - 1;
        boolean check = false;
        while (i < n && arr1[i] == goal.charAt(i)) {
            i++;
        }
        while (j >= 0 && arr1[j] == goal.charAt(j)) {
            j--;
        }

        // Swap ONLY those two mismatched characters
        if (i < j) {
            char temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;
        }

        for (int k = 0; k < arr1.length; k++) {
            sb.append(arr1[k]);
        }
        String result = sb.toString();
        if (result.equals(goal)) {
            check = true;
        } else {
            return false;
        }
        return check;
    }
}