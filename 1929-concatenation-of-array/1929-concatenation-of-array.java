class Solution {
    public int[] getConcatenation(int[] arr1) {
        int n = arr1.length;
        int arr2[] = new int[2*n];
        for(int i = 0; i<n; i++){
            arr2[i] = arr1[i];
            arr2[i+n] = arr1[i];
        }
        return arr2;
    }
}