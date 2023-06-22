import java.util.Scanner;
import java.util.Arrays;

// rotate array without using extra space.
public class class_ques5 {
    static void swap( int[] array ,  int i , int j){
        array[i] = array[i]+array[j];
        array[j] = array[i] -array[j];
        array[i] = array[i]-array[j];

    }
    static int[] reverse_without_extra_space(int []array ,int i ,int j){

        while ( i < j){
            swap(array, i , j );
            i++;
            j--;
        }
        return array;
    }
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
        k = k%n;
        //first thing to remember in it is how put the value of i and j ;
        reverse_without_extra_space(array,0,n-k-1);
        reverse_without_extra_space(array,n-k,n-1);
        int[] ans = reverse_without_extra_space(array,0,n-1);
        System.out.println(Arrays.toString(ans));
    }
}
