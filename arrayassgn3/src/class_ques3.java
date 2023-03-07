import java.util.Scanner;
// find the non-repeat element in array;

public class class_ques3 {

    static int non_repeated_element(int arr[]){
        int ans = 0 ;
        for ( int i = 0 ; i < arr.length; i++){
            for ( int j = i+1 ; j < arr.length; j++){
                if ( arr[j] == arr[i]){
                    arr[j] = arr[i] = -1 ;//here make a elements -1 those are repeated in array ;
                }
            }
        }
        for( int i = 0 ; i < arr.length; i++){
            if ( arr[i] != -1  ){
                ans = arr[i];
            }
        }
        return ans ;
    }

    public static void main(String[] args) {
        System.out.println(" enter array size ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0 ; i < n; i++){
            array[i] = sc.nextInt();

        }
        int ans = non_repeated_element(array);
        System.out.println(ans);
    }

}
