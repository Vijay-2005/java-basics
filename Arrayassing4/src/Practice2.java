import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {
    static int[] rotate( int[] array , int k ){

        int n = array.length;
        k = k%n ;
        int[] ans = new int[n];
        int j = 0 ;
        for ( int i = n-k ; i < n; i++,j++ ){
            ans[j] = array[i];
        }
        for (  int i = j ; i < n-k-1; i++){
            ans[j++]  = array[i];
        }
   return ans ; }

    static  void swap3( int[] array , int i , int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static void swap2(int a , int b ){
          a = a + b ;
          b  = a - b ;
          a = a - b ;
//        System.out.println("value of a after swap : "+a );
//        System.out.println("value of b after swap : " +b);
    }
    static  void reverse(int array[] , int srt , int end  ){
       int j = end ;
        for ( int i =srt ; i < array.length/2 ; i++ , j--){
            swap3( array , i , j );
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println(" value of a :");
//        int a = sc.nextInt();
//        System.out.println(" value of b :");
//        int b = sc.nextInt();
//        swap2(a,b);
        System.out.println(" type no of elements in array");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("type elements of array");
        for ( int i = 0 ;i < array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
//        reverse(array);
        System.out.println("type the value  of k ");
        int k = sc.nextInt();
// int ans[] = rotate(array,k );
//        System.out.println(Arrays.toString(ans));
        reverse(array,0,n-k-1);
        reverse(array,n-k,n-1);
        reverse(array,0  , n-1);
        System.out.println(Arrays.toString(array));
    }
}
