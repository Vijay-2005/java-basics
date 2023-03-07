// find the second_largest element in the array.

import java.util.Scanner;

public class class_ques4 {
    static int second_largest_element(int arr[]) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (ans < arr[i]) {
                ans = arr[i];
            } else ans = ans;
        }
        for (int i = 0; i < arr.length; i++) {
            if (ans == arr[i]) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int final_ans = Integer.MIN_VALUE ;
        for (int i = 0; i < arr.length; i++) {

            if (final_ans < arr[i]) {
                final_ans = arr[i];
            } else final_ans = final_ans;
        }
   return final_ans ;}

    public static void main(String[] args) {
        System.out.println(" enter array size ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0 ; i < n; i++){
            array[i] = sc.nextInt();

        }
         int ans = second_largest_element(array);
        System.out.println(ans);
    }
}
