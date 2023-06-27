import java.util.Arrays;
import java.util.Scanner;

//Q4. Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two
//        numbers such that they add up to a specific target number.
//        Return the indices of the two numbers added by one. Return -1 if pair does not exist.
public class Assign_Ques4 {
    static int[] pair_of_sum(int[] array , int m ){
         int sum = 0 ;

        for (int  i = 0  ; i < array.length;i++  ){
            for( int j = i+1 ;  j < array.length;j++){
                sum =  array[i]+ array[j];
                if ( sum == m ){
                    int[] indexes = { i+1, j+1};
                    return indexes;
                }
            }
        }
  return new int[]{-1};  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type the number of elements in array");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println(" type each elements of array");
        for (int i = 0 ; i< array.length ; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("numbers :" + Arrays.toString(array));
        System.out.println("Target number :");
        int m = sc.nextInt();
        int[] ans = pair_of_sum(array,m);
        System.out.println(Arrays.toString(ans));
    }
}
