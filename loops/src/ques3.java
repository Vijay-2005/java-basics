import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        int ans = 1;
        Scanner sc = new Scanner(System.in);
        int fac = sc.nextInt();
        for (int i = 1 ; i < fac ; i++){
            ans = ans*i ;
        }
        System.out.println(ans);
    }
}
