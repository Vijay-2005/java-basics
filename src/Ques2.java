import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type binary  number");
        int n  = sc.nextInt();
        int ans = 0;
        int power = 1; //2^0 = 0
        while( n > 0 ){
            int m = n%10 ;
            ans = ans + m*power;
            power = power*2;
            n = n /10;
        }
        System.out.println(ans);

    }
}

