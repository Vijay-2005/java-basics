//Q2. Given an integer array arr, return the number of consecutive sequences(subarrays) with odd sum.
import java.util.Arrays;
import java.util.Scanner;
public class Assign_Ques2 {
    static  int printAll_Subarrays(int[] arr) {
        int count =  0 ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0 ;
                for (int k = i; k <= j; k++) {
//                    System.out.print(arr[k] + " ");  code of subarray

                    for (int m = 0 ; m < arr.length; m++){
                        sum += arr[k];//here is the code of sum of elements of subarray
                    }
                }
                if ( sum%2 != 0 ){
                    count++;
                }
//                System.out.println();
 }
}
   return count; }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type the number of elements in array");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println(" type each elements of array");
        for (int i = 0 ; i< array.length ; i++){
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int ans = printAll_Subarrays(array);
        System.out.println( "final ans " + ans);
    }
}
