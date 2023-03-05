//Given an array arr[] and an integer K where K is smaller than size of array, the task is to
//        find the Kth  the smallest element in the given array. It is given that all array elements are
//        distinct.
import java.util.Scanner;
public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many elements you like in array");
        int N = sc.nextInt();
        int []Don =  new int[N] ;

        for( int i = 0 ; i < N ; i++){
            Don[i]  = sc.nextInt();
        }
        for( int i = 0 ; i < N ; i++){
            System.out.println(Don[i]);
        }
        int ans = Don[0] ;
        for ( int i = 1 ; i < N ; i++){
            if ( ans < Don[i]){
                ans = ans;
            }else { ans = Don[i];}
        }
        System.out.println( " K is " + ans);

    }

}
