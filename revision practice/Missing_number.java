//Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the
//        missing number from the first N integers. There are no duplicates in the list.
import java.util.*;
public class Missing_number {
    public static void main(String[] args) {
Scanner  sc = new Scanner(System.in);
        System.out.println("value of N ");
        int N = sc.nextInt();
        int []arr = new int[N-1];
        System.out.println("type the elements of array");
        for (int i = 0 ; i < N-1 ; i++){
             arr[i] = sc.nextInt();
        }
        int ans = 0 ;
        System.out.println(Arrays.toString(arr));
        for ( int i = 1 ; i <= arr.length+1; i++){
            boolean found = false;
            for ( int j = 0; j < arr.length; j++){
                if ( i == arr[j]){
                    found = true;
                    break;
                }
            }
            if (!found ){
ans = i ;
break;
            }

        }
        System.out.println("missing number " + ans);
    }
}
