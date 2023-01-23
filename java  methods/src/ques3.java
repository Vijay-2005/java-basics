import java.util.Scanner;
public class ques3 {
    public int display(String word) {
        int m = word.length();
        char ch;
        if (m % 2 == 0) {
            int n = m / 2;
            char ch1 = word.charAt(n);
            char ch2 = word.charAt(n - 1);
            System.out.print(ch2 );
            System.out.println(ch1);
            return ch1 + ch2;
        } else {
            ch = word.charAt((m - 1) / 2);
            System.out.println(ch);
        }
        return ch;

    }


    public static void main(String[] args) {
        System.out.println("write a string");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(word);
        ques3 obj = new ques3();
        char ans = (char) obj.display(word);



    }
}
