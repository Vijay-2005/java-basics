import java.util.Arrays;
import java.util.Scanner;

//rotate the given array "a" by k steps , where k is non-negative.
public class class_ques4 {
    static int[] rotate( int arr[] ,int k ){

        int n = arr.length;
         k = k%n;
        int[] arr_2 = new int[n];
        int j = 0 ;
        for (int i = n-k;i < n ; j++,i++){
            arr_2[j] = arr[i];
        }
        for( int i = 0 ; i<n-k;i++,j++){
            arr_2[j] = arr[i];
        }
        //we are using Array.toString() at the last so we don't need to use this code.
//for (int m = 0 ; m < arr_2.length; m++){
//    System.out.print(arr_2[m] + " ");
//}
return arr_2;   }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("type element in array");
        int n = sc.nextInt();
        int []array  = new int[n];
        for (int i = 0 ; i < n; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("type the value of k");
        int k = sc.nextInt();
//        System.out.println(rotate(array , k));
        System.out.println(Arrays.toString(rotate(array,k)));





    }
}
