//import java.util.Scanner;
//public class leap_year {
//    public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//        System.out.println(" Type year");
//      int n = sc.nextInt();
//      if (  n%100 == 0 ){
//          if( n % 400 == 0 ){
//              System.out.println(" year is leap year");
//
//          }else {
//              System.out.println(" year is not leap year");
//          }
//      }else if ( n % 4 == 0 ){
//          System.out.println(" year is leap year");
//      }else System.out.println("year is not leap year");
//    }
//}
import java.util.Scanner;
import java.util.Arrays;

class Solution {
    public int[] sortingOfPositiveAndNegative(int[] array_1, int n) {
        int array_2[] = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (array_1[i] > 0) {
                array_2[j] = array_1[i];
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (array_1[i] < 0) {
                array_2[j] = array_1[i];
                j++;
            }
        }
        return array_2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();
        int array_1[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array_1[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        int[] ans = obj.sortingOfPositiveAndNegative(array_1, n);
        System.out.println("Sorted array: " + Arrays.toString(ans));
    }
}