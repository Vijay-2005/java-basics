import java.util.Scanner;
public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please type sum");
        int sum = sc.nextInt();
        System.out.println(" type no of elements you like in array");
        int n = sc.nextInt();
        int []array = new int[n];
        for ( int i = 0 ; i < n ; i++){
            array[i] = sc.nextInt();
        }
        for ( int i = 0 ; i < n  ; i++){
            int ans = 0 ;
            for ( int j = i ; j < n ; j++){
                ans = ans + array[j];
                if( ans == sum){
                    System.out.println( i );
                    System.out.println( j );
                    System.exit(0 );

                }

            }
        }


    }
}
