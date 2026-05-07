package ARRAYPROBLEMS;

public class Missingnumber_12 {
    // 1. Added 'public' - Java needs 'public static void main' to run
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};

        int n = arr.length + 1;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        System.out.println("Actual Sum: " + actualSum);
        System.out.println("Expected Sum: " + expectedSum);
        System.out.println("Missing number is: " + (expectedSum - actualSum));
    }
}