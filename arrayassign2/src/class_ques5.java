import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Scanner;

public class class_ques5 {
    static   int[] smallestAnd_largest_value(int[] arr){
// Array.sort is used to sort  array in increasing order
        Arrays.sort(arr);


int[] ans = { arr[0], arr[arr.length-1]};//here we are making  array ans which is contain smallest and largest element
return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many element you like in array");
        int m = sc.nextInt();
        int []array  = new int[m];
        for ( int i = 0 ; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        int[] answer = smallestAnd_largest_value(array); //here we call the method making array "answer" which contain
        // smallest and largest value of array

        System.out.println( "smallest" + answer[0]);
        System.out.println("largest" + answer[1]);


    }
}
