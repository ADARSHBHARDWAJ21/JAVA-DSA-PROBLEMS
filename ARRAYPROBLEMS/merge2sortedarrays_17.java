package ARRAYPROBLEMS;

import java.util.Arrays;

public class merge2sortedarrays_17 {
    // 1. Added 'public' to the main method
    public static void main(String[] args) {
        int[] a = {11, 33, 42, 71};
        int[] b = {26, 54, 69, 81};

        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        // 2. Merging while both arrays have elements
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++; // Only increment k once per loop iteration
        }

        // 3. If array 'a' is finished, copy remaining 'b'
        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }

        // 4. If array 'b' is finished, copy remaining 'a'
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }

        // Print the result to verify
        System.out.println(Arrays.toString(c));
    }
}