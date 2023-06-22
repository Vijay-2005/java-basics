import java.util.Scanner;
import java.util.Arrays;
public class rotate {

    static  void swap3( int[] array , int i , int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    static  void reverse(int[] array , int srt,int end){
        int j = end ;
        for ( int i =srt ; i < array.length/2 ; i++ , j--){
            swap3( array , i , j );
        }
        System.out.println(Arrays.toString(array));
    }

    static int[] rotate( int[] array , int n , int k){
        int[] ans = new int[n];
        int j = 0;
        for ( int i = n - k ; i < n ; i++){
            ans[j++] = array[i];
        }
        for (int i = 0 ; i <= n-k-1; i++){
            ans[j++] = array[i];
        }
        return ans ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type the size of array");
        int n = sc.nextInt();
        System.out.println("type elements of array");
        int[] array = new int[n];
        for (int i = 0 ; i < n ; i++ ){
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("type value of k");
        int k = sc.nextInt();
//         int[] ans = rotate(array,n,k);
//        System.out.println(Arrays.toString(ans));
        reverse(array,0,n-k-1);
        reverse(array,n-k,n-1);
        reverse(array,0,n-1);
        System.out.println(Arrays.toString(array));
    }
}
