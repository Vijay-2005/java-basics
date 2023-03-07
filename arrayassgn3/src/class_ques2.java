import java.util.Scanner;
public class class_ques2 {
    static int  sum_triplet( int []arr ,  int target){
        int ans = 0 ;
        for( int i = 0 ; i < arr.length; i++){//for a first number
            for ( int j = i+1 ; j < arr.length; j++){// for second number
                for( int k = j+1 ; k < arr.length ; k++){//for third number
                    int sum = 0 ;
                    sum = arr[i] + arr[j] + arr[k] ;
                    if( sum == target){
                        ans++;
                    }
                }
            }
        }
   return ans; }

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
        int final_ans = sum_triplet(array, target);
        System.out.println(final_ans);
    }
}
