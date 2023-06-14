import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println(" Type year");
      int n = sc.nextInt();
      if (  n%100 == 0 ){
          if( n % 400 == 0 ){
              System.out.println(" year is leap year");

          }else {
              System.out.println(" year is not leap year");
          }
      }else if ( n % 4 == 0 ){
          System.out.println(" year is leap year");
      }else System.out.println("year is not leap year");
    }
}
