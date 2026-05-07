package TWODARRAYPROBLEMS;
import java.util.Scanner;

public class Problem_01 {
    // FIX 1: Added 'public' - Java needs the main method to be public to run
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // This creates 4 rows (students) and 2 columns (Roll No, Marks)
        int[][] arr = new int[4][2];

        System.out.println("Enter Roll Number and Marks for 4 students:");

        // Input loop
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nRoll No | Marks");
        System.out.println("---------------");

        // Output loop
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                // FIX 2: Use System.out.print (not println) to keep values on the same line
                System.out.print(arr[i][j] + "    ");
            }
            // FIX 3: Move the println here to start a new line after each student (row)
            System.out.println();
        }
    }
}