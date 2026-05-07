package ARRAYPROBLEMS;

public class SUMOFELEMENTSinArray_01 {
    static void main(String[] args) {
        int[] arr = {2,3,4,54,33};
        int n = arr.length;
        int sum = 0;
        for (int i=0 ; i<n  ; i++) {
            sum+= arr[i];

        }
        System.out.println(sum);

    }
}
