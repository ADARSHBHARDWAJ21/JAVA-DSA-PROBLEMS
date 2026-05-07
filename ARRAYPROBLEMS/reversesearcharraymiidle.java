// reversing array from middle
package ARRAYPROBLEMS;

public class reversesearcharraymiidle {
    static void main(String[] args) {
        int[] arr = {6,8,1,2,4,9};
        int n = arr.length;
        int i = 2 , j = 5;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
        for(int ele:arr){
            System.out.println(ele + " ");
        }
    }
}

