import java.util.Scanner;
 public class Ques4 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         if ( n <= 0){
             System.out.println(" it is negative number and skipped ");
         }else {
             System.out.println(n);
         }
     }
}
