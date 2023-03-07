//- Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the
//        missing number from the first N integers. There are no duplicates in the list.
import java.util.Scanner;

public class AssignQues3 {


    public static void main(String[] args) {
        System.out.println(" enter array size ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0 ; i < n; i++){
            array[i] = sc.nextInt();
        }
        int sum = ( (n+1) *(n+2))/2; // there is remembering you have to take a sum of one more than array.
       for (int i = 0 ; i < array.length; i++){
           sum -= array[i];
       }

        System.out.println(sum);



    }

}
