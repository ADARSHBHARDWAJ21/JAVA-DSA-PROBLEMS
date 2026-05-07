package ARRAYPROBLEMS;

public class Maxelemtinarray_03 {
    static void main(String[] args) {
        int []arr = {2,34,5,66,74,75,99};
        int n = arr.length;
        //int mx = 0;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            if(arr[i]>mx )
                mx = arr[i];


        }
        System.out.println(mx);
    }
}
