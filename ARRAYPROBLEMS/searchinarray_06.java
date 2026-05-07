// linear search
package ARRAYPROBLEMS;

public class searchinarray_06 {
    static void main(String[] args) {
       int []arr = {23,43,12,42,54,90,89};
       int target = 43;
       int n =arr.length;
       boolean flag = false;
        for (int i = 0; i <n ; i++) {
            if(arr[i]== target){
                flag = true;
                break;
            }

        }
        if(flag = true){
            System.out.println("Element found in array");
        }
        else{
            System.out.println("Element not found in array");
        }
    }
}
