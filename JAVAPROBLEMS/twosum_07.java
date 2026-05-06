package JAVAPROBLEMS;

public class twosum_07 {
    static void main() {
        int arr[] = {1,5,8,-3};
        int n = arr.length;
        int sum = 2;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[i]+arr[j] == sum){
                    System.out.println(arr[i]+ " " +arr[j]);
                }

            }

        }
    }
}
