import java.util.Scanner;

public class class_ques5 {
    static int repeated_elements(int arr[]){

        for (int i = 0 ; i < arr.length; i++){
            for ( int j = i + 1 ; j < arr.length; j++){
                if ( arr[i] == arr[j] ){
                    return   arr[i];

                }

            }

        }
        return -1 ;
    }

    public static void main(String[] args) {
        System.out.println(" enter array size ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0 ; i < n; i++){
            array[i] = sc.nextInt();
        }
        int answer = repeated_elements(array);
        System.out.println(answer);


    }
}
