import java.util.Scanner;
public class Ques_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" type your decimal number");
        int m = sc.nextInt();
        System.out.println("type your binary number");
        int n = sc.nextInt();
        int ans = 0;
        int power = 1;
        while(n>0){
            int l = n %10;
            ans += (l*power);
            power *= 2;
            n /= 10 ;
        }
        System.out.println(ans);
        int final_ans = m*ans ;
        System.out.println(final_ans);

    }
}
