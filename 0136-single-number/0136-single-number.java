class Solution {
    public int singleNumber(int[] arr) {
        int single = 0;
        for (int num : arr) {
            single ^= num;
        }
        return single;
    }
}