import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
//        question of fibonacci series
//        fibonacci is a sum of the previous two digits
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
            int a= 0 ;
            int b = 1;
            int c ;
        for (int i = 1 ; i <= n ; i++) {
             c = a + b ;
             a = b ;
             b = c ;
            System.out.println( a + " ");

        }

        }
    }

