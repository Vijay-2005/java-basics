//take input of array.
import java.util.Scanner;
public class class_ques1 {
    public static void main(String[] args) {
        int[] arr =  new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the elements of array ");
        for (int i = 0 ; i < arr.length; i++){
             arr[i] = sc.nextInt();
        }
        for ( int i = 0 ; i <  arr.length; i++) {
            System.out.print(   arr[i] + " ");
        }
    }
}
