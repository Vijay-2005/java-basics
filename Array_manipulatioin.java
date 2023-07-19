import  java.util.Arrays;
import java.util.Scanner;

public class Array_manipulatioin {
    static int unique_value(int[] array){
        for (int i = 0 ; i < array.length; i++){
            for (int j = i+1 ; j < array.length; j++){
                if ( array[i] == array[j]){
                    array[i] = -1 ;
                    array[j] = -1 ;

                }
            }
         }
        int ans = 0  ;
       for ( int i = 0 ; i < array.length; i++){
           if (array[i] > 0 ){
                ans = array[i];
           }
       }
        return ans ;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("tell me length of array you want");
        int  n = sc.nextInt();
        int array_1[] = new int[n] ;

        System.out.println("type elements of array");
        for (int i = 0 ; i < n ; i++){
            array_1[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array_1));
       int ans =  unique_value(array_1);
        System.out.println(ans );

    }
        }
