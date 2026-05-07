package ARRAYPROBLEMS;

public class Minimumelementofarray_04 {
    static void main(String[] args) {
        int []arr = {2,34,5,66,74,75,99};
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <n ; i++) {
            if(arr[i]<min )
                min = arr[i];


        }
        System.out.println(min);
    }
    }

