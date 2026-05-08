package TWODARRAYPROBLEMS;

public class addtwomatrix_04 {
    // FIX 1: Added 'public' so the program can actually run
    public static void main(String[] args) {
        int[][] a = {{1, 9, 2}, {3, 7, 4}, {8, 5, 6}};
        int[][] b = {{9, 3, 7}, {8, 6, 5}, {2, 4, 1}};

        int m = a.length;    // Number of rows
        int n = a.length; // Number of columns

        int[][] res = new int[m][n];

        // Calculation Loop
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }

        // FIX 2: Removed the second 'int[][] res = new int[m][n];'
        // You cannot declare the same variable name twice in the same scope.

        System.out.println("Resultant Matrix:");
        // Output Loop
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}