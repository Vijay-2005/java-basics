//Q1. Given an integer m, n, and n integers, return true if the number of unique integers among the n integers is
//        greater than or equal to m, else return false.(Integers appearing multiple times are all considered as 1 unique
//        integer)
import java.util.Arrays;
import java.util.Scanner;
public class Assign_Ques1 {
    static int unique_integer(int[] array){
        Arrays.sort(array);
        int count = 0 ;
        for ( int i = 0 ; i < array.length-1;i++){
            if (array[i] != array[i+1]){
                count++;
            }
        }
   return  count; }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type the value of m ");
        int m = sc.nextInt();
        System.out.println("type the value of n ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("type the value of n length array");
        for ( int i =0 ;i < n ; i++){
            array[i] = sc.nextInt();
        }
        int unique = unique_integer(array);
        System.out.println(unique);
        if ( unique >= m){
            System.out.println("true");
        }else System.out.println("false");

    }
}
