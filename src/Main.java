import java.util.Scanner;
import java.io.CharArrayWriter;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        a++;
        b--;
        int c = b % a ;
        System.out.println( c >= b);
//        int x = y = z = 10 ;
//        System.out.println(x  + " " + y + " " + z);
//int i = 19 , j = 29 , k;
//k  = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
//        System.out.println(i);
//        System.out.println(j);
//        System.out.println(k);
        Scanner sc = new Scanner(System.in);
//        int  x = sc.nextInt();
//
//       int  y = ( 8 + x ) / 3 ;
//       int z = y % 5 ;
//       int m = z*5;
//        System.out.println(m);
//        System.out.println(z);
//        System.out.println(y);
        System.out.println("enter first number ");
        int num_2 = sc.nextInt();
        System.out.println("enter second number");
        int num_3 = sc.nextInt();
        System.out.println(num_3);
        System.out.println(num_2);
//        question number 3
//        solution 1 not correct
        System.out.println("type a three digit number ");
        int sum = sc.nextInt();
//        convert int into a string
        String string_number = Integer.toString(sum);
//          System.out.println(string_number.charAt(0));
//        System.out.println(string_number.charAt(1));
//        System.out.println(string_number.charAt(2));
//        solution 2
        System.out.println("write first digit of your number ");
        int num1 = sc.nextInt();
        System.out.println("then second");
        int num2 = sc.nextInt();
        System.out.println("then third");
        int num3 = sc.nextInt();

        System.out.println(num1 + num2 +num3);
//        solution4
int x = 55;
int y = 70;
boolean condition  = x < 50 && x < y ;
boolean condition2 =  x < 50 || x < y ;
        System.out.println(condition);
        System.out.println(condition2);
//        vijay kumar prajapati
//        next update testing














    }
}
