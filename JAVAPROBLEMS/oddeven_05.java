// Multiply odd indexed element by 2 qand add 10 to even indexed element
package JAVAPROBLEMS;

public class oddeven_05 {
    static void main(String[] args) {
        int arr[] = {2,34,5,35,53,5,3,2,33,8};
        int n = arr.length;
        for (int i = 0; i <n ; i++) {
            if(i%2==0){
                System.out.println(arr[i]*2);
            }
            else{
                System.out.println(arr[i]+10);
            }

        }
    }
}
