package prime;
import java.util.Scanner;
public class prime {

    static int prime(int number) {

        for ( int i = 2 ; i < number/2 ; i++){
            if (  number % i == 0 ){
                System.out.println( number + " is  not a prime number");
                break;
            }
        }
        System.out.println( number + " is  a prime number");


  return number;  }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" type your number");
        int n = sc.nextInt();
        int ans = prime(n);
    }
}