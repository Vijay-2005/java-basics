import java.math.BigInteger;
import java.util.Scanner;
public class loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int   sum_of_digits = 0 ;
        System.out.println("type your number");
         long n = sc.nextLong();
        while(n > 0 ){ sum_of_digits += n%10;
            n = n/10 ;

        }
        System.out.println(sum_of_digits);
    }
}
