package TWODARRAYPROBLEMS;

public class Rowwisecolumnwiseprinting {
    public static void main(String[] args) {
        // Original: 3 rows, 2 columns (3x2)
        // 1 2
        // 3 4
        // 5 6
        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};
        int m = arr.length;    // rows = 3
        int n = arr[0].length; // cols = 2

        System.out.println("Original Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nTransposed Matrix (Stored and Printed):");

        // 1. Initialize the transpose array with swapped dimensions (nxm)
        int[][] transpose = new int[n][m];

        // 2. Fill the transpose array
        // Logic: arr[i][j] becomes transpose[j][i]
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        // 3. Print the transpose array
        for (int i = 0; i < n; i++) { // now looping up to n (new rows)
            for (int j = 0; j < m; j++) { // now looping up to m (new cols)
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}