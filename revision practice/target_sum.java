import java.util.Arrays;
import java.util.Scanner;
public class target_sum {
    static int[] array_input(int n ){
        Scanner sc = new Scanner(System.in);
        System.out.println("type elements of array");
        int array_1[] = new int[n] ;
        for (int i = 0 ; i < n ; i++){
            array_1[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array_1));
        return array_1;
    }
    static int  target_sum(int[] array,int target){
        int ans = 0 ;
        for (int i = 0 ; i < array.length; i++){
            for (int j = i ; j < array.length ; j++){
               for (int k = j+1; k < array.length;k++  ){
                   int  sum = array[i] + array[j] +array[k];
                   if ( sum == target ){
                       ans++;
                   }
                   sum = 0 ;
               }
            }
        }
  return ans;  }


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("no of elements you like in array");
        int m = sc.nextInt();
        System.out.println("sum of target");
        int target  = sc.nextInt();
          int[] array = array_input(m);
        System.out.println(target_sum(array,target));



    }
}
