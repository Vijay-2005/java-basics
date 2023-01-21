import java.util.Scanner;
public class ques4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i = 1; i <= t; i++){
            int num_1 = scn.nextInt();
            int num_2 = scn.nextInt();
            System.out.println(num_1+num_2);
        }
    }
}

