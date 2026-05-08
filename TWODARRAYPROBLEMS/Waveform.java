package TWODARRAYPROBLEMS;

public class Waveform {
    public static void print(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = arr.length, n = arr[0].length;

        System.out.println("Original Matrix:");
        print(arr);

        System.out.println("Wave Print (Row-wise):");
        // Wave print -> row wise (alternate)
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                // Even row: Left to Right
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                // Odd row: Right to Left
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            // Optional: Print a space or comma here to separate rows visually
        }
        System.out.println();
    }
}