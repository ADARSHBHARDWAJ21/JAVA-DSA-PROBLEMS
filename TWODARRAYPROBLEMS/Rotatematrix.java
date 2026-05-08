//WAP TO ROTATE ARRAY BY 90 DEGREE
package TWODARRAYPROBLEMS;

public class Rotatematrix {
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
        // Note: For in-place rotation, we usually use square matrices (e.g., 3x3)
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = arr.length;

        System.out.println("Original Matrix:");
        print(arr);

        // STEP 1: TRANSPOSE (Swap arr[i][j] with arr[j][i])
        // Only loop through the upper triangle (j = i) to avoid swapping back
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // STEP 2: REVERSE EACH ROW
        for (int i = 0; i < n; i++) {
            int a = 0, b = n - 1;
            while (a < b) {
                int temp = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] = temp;
                a++;
                b--;
            }
        }

        System.out.println("After 90 Degree Rotation:");
        print(arr);
    }
}