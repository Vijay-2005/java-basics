 import java.util.Arrays;
public class ques4 {
    public static void main(String[] args) {
        int arr[] = {2, -3, 5, 8, 1, 0, -4};
        int ans = arr[0];
        for ( int  i = 0 ; i < arr.length; i++){

             ans = Math.min( ans , arr[i]);
        }
        System.out.println(ans);
            }
        }



