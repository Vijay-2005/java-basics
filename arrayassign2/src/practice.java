import java.util.Scanner;
public class practice {
    static int input_array( int m){
        int ans = 0 ;
        Scanner sc = new Scanner(System.in) ;
        int  arr3[] = new int[m];
        System.out.println(" enter the element of array");
        for ( int i  = 0 ; i < m ; i++){
            arr3[i] = sc.nextInt();

        }
        System.out.println("this is array");
        for( int i = 0 ; i < m ; i++){
            System.out.println(arr3[i]);
        }
        return  ans ;
    }
    static  int last_occurrences(int arr[] , int y ){
        int ans_2 = 0 ;
        for( int i = 0 ; i < arr.length; i++){
            if ( arr[i] == y){
             ans_2 = i ;
            }
        }
        return ans_2 ; }
    static int occurrences(int[] arr, int x ) {
//
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }
    static boolean sort(int arr[] ) {
        boolean ans = true;
        for (int i = 1 ; i < arr.length; i++){
            if ( arr[i] < arr[i-1]){
                 ans = false;
                break;

            }
        }

     return ans ;}

    public static void main(String[] args) {
        int arr_1[] = {4, 8, 9, 6, 5, 4, 5, 4, 6, 4, 5};
        int arr_2[] = { 2 , 3, 4, 5, 6 ,7};
         int  ans = occurrences(arr_1,4);
        System.out.println( ans);
          int  ans_2 = last_occurrences(arr_1 , 5);
        System.out.println(ans_2);
        boolean ans_3 = sort(arr_2);
        System.out.println(ans_3);
        Scanner sc = new Scanner(System.in) ;
        int m = sc.nextInt();
        int ans_4 = input_array(m);

    }
}