//Find the total number of pairs in the array whose sum is equal to the given  value x;
import java.util.Scanner;
public class class_ques1 {
    static  int pair_sumL(int array[], int target){
        int ans = 0 ;
        for (int i = 0 ; i < array.length; i++){

            for (int j = i+1 ; j < array.length; j++){
                int sum = 0 ;
                sum = array[i]+ array[j];
                if ( sum == target){
                    ans++;
                }

            }
        }

  return ans;  }
    public static void main(String[] args) {
        System.out.println(" enter array size ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0 ; i < n; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Write target");
        int target = sc.nextInt();
 int ans = pair_sumL(array,target );

        System.out.println(ans);
    }
}
