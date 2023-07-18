import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        boolean ans =  scanner.hasNextInt();
//        int n = scanner.nextInt();
        if ( scanner.hasNextInt()){
            int n = scanner.nextInt();
        }

        System.out.println(ans);
//        System.out.println(n);


    }
}
