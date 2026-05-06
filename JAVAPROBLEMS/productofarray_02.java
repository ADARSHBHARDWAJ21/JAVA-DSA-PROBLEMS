package JAVAPROBLEMS;

public class productofarray_02 {
    static void main(String[] args) {
        int []arr = {2,45,4,2,2};
        int n = arr.length;
        int product = 1;

        for (int i = 0; i <n ; i++) {
            product *= arr[i];


        }
        System.out.println(product);
    }

}
