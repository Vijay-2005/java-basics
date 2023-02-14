import java.util.Scanner;
public class ques4 {
    public static void main(String[] args) {
        System.out.println("type number ");
        Scanner sc = new Scanner(System.in);
        System.out.println("type number ");
        int n = sc.nextInt();
        int original = n ;
        int temp , arm = 0 ;
        while ( n > 0 ){
            temp = n % 10 ;
            temp = (int) Math.pow(temp , 3);
            arm = arm + temp ;
            n = n /10;

        }
        if ( arm == original )
            System.out.println(" armstrong number ");
        else System.out.println(" not armstrong number") ;
    }
}