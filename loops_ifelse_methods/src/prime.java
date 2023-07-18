import java.util.Scanner;
import java.lang.String;

public class prime {
    public static void  Prime_check(int n) {
        int i;
        for (i = n / 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("no is not prime number");
                return;
            }
        }
        System.out.println("Given number is prime number  ");
    }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("print the value of n :");
            int n = sc.nextInt();
            Prime_check(n);

        }
    }

