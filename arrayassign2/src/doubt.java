import java.util.Scanner;
public class doubt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i , j ;
        i = 1;
        j = 1 ;
        while ( i <= n ){
            while( j <= n ){
                System.out.print("*");
                j++;
            }
            System.out.println("*");
            i++;
        }
    }
}
