import java.util.Arrays;
import java.util.Scanner;

public class Assign_Ques5 {
    static void swap(int[] array , int i , int j){
        int temp  = array[i];
        array[i] = array[j];
        array[j] = temp;


    }
    static int[] reverse(int[] array ){
        int j = array.length-1;
        for ( int  i = 0 ; i < array.length/2; i++ , j--){
            swap(array,i,j);
        }
        return array;
    }
    static int[]  Square_of_array(int[] array){
        int left = 0 ;
        int right = array.length-1;
        int i = 0 ;
        int[] array_2 = new int[array.length];
        while (left <= right){
            if ( Math.abs(array[left]) < Math.abs(array[right])){
                right--;
                array_2[i] = array[right]*array[right];
                i++;

            }else {
                array_2[i] = array[left]*array[left];
                i++;
                left++;
            }
        }
    return array_2;}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type the number of elements in array");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println(" type each elements of array");
        for (int i = 0 ; i< array.length ; i++){
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
         int[] ans = Square_of_array(array);
        System.out.println(Arrays.toString(ans));
        int[] final_ans = reverse(ans);
        System.out.println(Arrays.toString(final_ans));



    }
}
