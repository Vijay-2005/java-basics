
import java.util.Arrays;
import java.util.Scanner;

//Reverse of array consisting of integer values;
public class Class_ques3 {
    static void swap( int[] array ,  int i , int j){
        array[i] = array[i]+array[j];
        array[j] = array[i] -array[j];
        array[i] = array[i]-array[j];

    }
    static int[] reverse_without_extra_space(int []array){
        int i = 0 ;
        int j = array.length -1 ;
        while ( i < j){
            swap(array, i , j );
            i++;
            j--;
        }

return array;

    }
    static int[] reverse_array( int []arr){
        int i  ;
        int j  ;
        int []arr_2 = Arrays.copyOf(arr , arr.length);
        for(i = 0 , j = arr.length-1 ; i < arr.length ;  i++ , j--){
            if ( j >= 0 ){
                arr[i]  = arr_2[j];
            }
        }
        for( int k = 0 ; k < arr.length; k++){
            System.out.print( arr[k]+" ");
        }
   return arr; }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("type element in array");
        int n = sc.nextInt();
        int []array  = new int[n];
        for (int i = 0 ; i < n; i++){
            array[i] = sc.nextInt();
        }
//        System.out.println(reverse_array(array));
        System.out.println(Arrays.toString(reverse_without_extra_space(array)));
    }
}
