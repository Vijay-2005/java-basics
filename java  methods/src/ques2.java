import java.util.Scanner;
public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your string");
        String word = sc.nextLine();
        System.out.println(word);
        ques2 obj = new ques2();
        int ans = obj.vowel(word);
        System.out.println(ans);
    }

//    in this part after completion code  in public static void main(String[] args) we write a method
    public static int vowel(String word) {

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
//        System.out.println(count);
        return count;
    }

}



