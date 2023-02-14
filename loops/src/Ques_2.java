import java.util.Scanner;
public class Ques_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many input you want");
        int n = sc.nextInt();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            if (input > 0) {
                ans = ans + input;
            } else {
                System.out.println(" -1 ");
                break;
            }
        }
        System.out.println(ans);
    }
}
