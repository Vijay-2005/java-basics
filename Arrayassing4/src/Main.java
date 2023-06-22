import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
// write a program to identify the prime number;
public class Main {
    public static void main(String[] args) {
        System.out.println(" type the number, which you want to check");
        Scanner sc = new Scanner(System.in);
        boolean ans = true;
        int n = sc.nextInt();
        if( n == 1 || n == 0 ){
            System.out.println(" it's not a prime number");
            System.exit(0);
        }
        int m = n/2;
        for (int i = 2 ; i < m ; i++){
            if ( n%i == 0){
                ans = false;
            }


    }
        if(ans){
            System.out.println(" it is a prime number");
        }else System.out.println("it is not a prime number");
    }

}