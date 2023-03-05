//import java.util.Scanner;
public class class_ques2 {
    static void print_array(  int []arr){
    for ( int i = 0 ; i < arr.length; i++){
        System.out.print( arr[i] + " ");

    }
        System.out.println();

  }
    public static void main(String[] args) {
        int []arr = { 1,2,3,4,5,6};
        System.out.println("original array");

        print_array(arr);
        int []arr_2 = arr;
        System.out.println("array 2 ");
        print_array(arr_2);
        arr_2[0] = 0 ;

        arr_2[1] = 0 ;
        System.out.println("array after changing the value of second array");
        print_array(arr);
        System.out.println("array 2 after changing its value");
        print_array(arr_2);


    }
}
