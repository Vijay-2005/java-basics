import java.util.Scanner;

public class exeption {
    public static void main(String[] args) {
//        answer 5
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number");
        int num_1 = sc.nextInt();
        int  num_2 = sc.nextInt();
        System.out.println("enter operator");
        int operator1 = sc.nextInt();
        int x = num_1+num_2;
        int y = num_1 - num_2;
        int z = num_1*num_2;
        int m = num_1/num_2;
        switch (operator1){
            case'+':
                System.out.println( x);
                break;
            case'-':
                System.out.println(y );
            case'*' :
                System.out.println( z);
            case '/':
                System.out.println( m);
        }
    }
}
