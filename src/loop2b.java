import java.util.Scanner;
public class loop2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type the value of a");
        int a = sc.nextInt();
        System.out.println("type the value of b ");
        int b = sc.nextInt();
        int ans = 1 ;
        int i = 1 ;
        while( i <= b ){
            ans *= a ;
            i++;

        }
        System.out.println(ans);

    }
}
