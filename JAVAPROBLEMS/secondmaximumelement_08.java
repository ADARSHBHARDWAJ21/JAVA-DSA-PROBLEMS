package JAVAPROBLEMS;

public class secondmaximumelement_08 {
    static void main(String[] args) {
        int [] arr = {23,12,10,19,34,39};
        int n = arr.length;
        int max = 0;
        int smax  = 0;
        for (int i = 0; i <n; i++) {
            if
            (arr[i]>max)
            {max = arr[i];
            }

            }
        for (int i = 0; i <n ; i++) {
            if(arr[i]>smax &&  arr[i] != max ){
                smax = arr[i];
            }
        }
        System.out.println(smax);

        }
    }
