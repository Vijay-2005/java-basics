import java.util.Scanner;
public class Ques_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type decimal number");
        int n  = sc.nextInt();
        int power = 1 ;
        int ans = 0 ;
        while ( n > 0 ){
            int parity = n % 2 ;
            ans = ans + ( parity *power);
            power = power*10;
            n = n/2;

        }
        System.out.println(ans);
    }
}
