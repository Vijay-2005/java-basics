import java.util.Scanner;

public class Ques4 {
    public boolean leap(int n){  if (n % 10 == 0) {
        n = n / 10;
        if (n % 10 == 0) {
            n = n / 10;

            if (n % 4 == 0) {
                System.out.println("it is a leap year");
                return true ;
            } else {
                System.out.println("it is not a leap year");
            }
        } else if (n % 4 == 0) {
            System.out.println("it is a leap year");

        } else {
            System.out.println("it is not a leap year");

        }

    } else if (n % 4 == 0) {
        System.out.println("it is a leap year");

    } else {
        System.out.println("it is not a leap year");
    }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your string");
        int n = sc.nextInt();

        System.out.println(n);
        Ques4 obj = new Ques4();
        String ans = String.valueOf(obj.leap(n));

    }
}
