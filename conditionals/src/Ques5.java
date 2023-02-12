import java.util.Scanner;
public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int op = sc.next().charAt(0);
        int answer =0;

        switch ( op){
            case '+' :
            answer = n + m ;
                System.out.println(" addition of number is " + answer );
            break;
            case '-':
            answer = n - m ;
                System.out.println(" Subtraction of number is " + answer );
            break;
            case '*':
            answer = n * m ;
                System.out.println(" Multiplication of number is " + answer );
            break;
            case '/':
            answer = n / m ;
                System.out.println(" Division of number is " + answer );
            break;
            default:
                System.out.println("not exist");

        }

    }
}
