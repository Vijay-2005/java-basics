
import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write your number");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println(number);
        } else {
            System.out.println(number * (-1));
    }
}
}
