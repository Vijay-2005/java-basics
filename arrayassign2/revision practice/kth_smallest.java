import java.util.Scanner;
import  java.util.Arrays;
public class kth_smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" give the value of kth smallest and largest you want");
        int  k = sc.nextInt();
        System.out.println("how many elements you like in array");
        int n = sc.nextInt();
        if ( n >= 2*k){
            int array_1[] =  new int[n];
            System.out.println("type elements of array");
            for (int i = 0 ; i < n ; i++){
                array_1[i]  = sc.nextInt();
            }
            System.out.println( "array without sort :"+ Arrays.toString(array_1));
             Arrays.sort(array_1);
            System.out.println( "Sorted array :" + Arrays.toString(array_1));
            System.out.println("kth Smallest :" + array_1[k-1]);
            System.out.println("kth greatest : " + array_1[array_1.length-k]);
        }else System.out.println(" value of n is less than 2k means your given array don't have desired value");
    }
}
