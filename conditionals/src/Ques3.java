import java.util.Scanner;
public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S_P  = sc.nextInt();
        int C_P = sc.nextInt();
        int profit  = S_P - C_P ;
        int loss = C_P- S_P;
        System.out.println(profit);
        System.out.println(loss);
    }
}
