import java.util.Scanner;


public class ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type sum of numbers");
        int sum = sc.nextInt();
        System.out.println("no of elements you like in array");
        int m = sc.nextInt();
        int array_1[] = new int[m] ;
        System.out.println("type elements of array");
        for (int i = 0 ; i < m ; i++){
            array_1[i] = sc.nextInt();
        }
        for (int i = 0 ; i < m  ; i++){
             int ans = 0 ;
             for (int j = i ; j < m;j++ ){
                 ans += array_1[j];
                 if ( ans == sum){
                     System.out.println( i );
                     System.out.println( j);
                     System.exit(0);
                 }
             }
        }

       }
}