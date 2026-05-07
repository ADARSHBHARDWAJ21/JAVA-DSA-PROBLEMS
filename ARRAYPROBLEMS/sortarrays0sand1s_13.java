package ARRAYPROBLEMS;


import java.util.Arrays;

public class sortarrays0sand1s_13 {
    // Added 'public' and 'String[] args' to make it a valid executable main method
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 1, 0, 0, 0, 1, 0};
        int n = arr.length;
        int noOfZeroes = 0;

        // Pass 1: Count the number of zeros
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                noOfZeroes++;
            }
        }

        // Pass 2: Fill the first 'noOfZeroes' indices with 0
        for (int i = 0; i < noOfZeroes; i++) {
            arr[i] = 0;
        }

        // Pass 3: Fill the remaining indices with 1
        for (int i = noOfZeroes; i < n; i++) {
            arr[i] = 1;
        }

        // Print the result to verify
        System.out.println(Arrays.toString(arr));
    }
}