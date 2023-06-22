//Q1. Given an array arr[] of size n, find the first repeating element. The element should occur more than
//        once and the index of its first occurrence should be the smallest. If no repeating element exists, print -1.
import java.util.Scanner;

public class assign_ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" type no of elements in array");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("type elements of array");
        for ( int i = 0 ;i < array.length; i++){
            array[i] = sc.nextInt();
        }
        for (int i = 0 ;i < array.length ; i++){
            for (int j = 0 ; j < array.length; j++){
                if ( array[i] == array[j]){
                    System.out.println("first repeating element"+array[i]);
                    System.exit(0);
                }
            }
        }
        System.out.println("-1");
    }
}
