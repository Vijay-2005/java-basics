//Given an array of size n, find the total number of occurrences of given number x.
import java.util.Scanner;

public class AssignQues2 {
    static  int number_of_occurrences(int arr[] , int x ){
        int ans = 0 ;
        for( int i = 0 ; i < arr.length; i++){
            if( arr[i] == x){ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(" enter array size ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0 ; i < n; i++){
            array[i] = sc.nextInt();
        }
        System.out.println(" type target");
        int x = sc.nextInt();
        int final_answer = number_of_occurrences(array ,x);
        System.out.println(final_answer);
    }
}

