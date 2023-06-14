import java.util.Scanner;
public class reverse_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write dowm the number you want to reverse");
        int n = sc.nextInt();
        System.out.println(n);
        int ans = 0 ;

        for (int i = 0 ; n >  0 ; i++){
            int m = n%10 ;
             ans = ans*10 + m;

            n = n/10;
        }
        System.out.println(ans);
    }
}
