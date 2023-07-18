import java.util.Scanner;

public class DigonalStarPattern {
    public static void Diagonal(int n){
        if (n < 5 ){
            System.out.println("invalid");
            return;
        }
        for (int i = 0 ;i< n ; i++){
          for (int j = 0 ; j<n ; j++){
              if (i==j || i+j == n-1 || i==0||i==n-1||j==0||j==n-1){
                  System.out.print("*");
              }else System.out.print(" ");
          }
            System.out.println();     }
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("type the value of n");
        int n = sc.nextInt();
        Diagonal(n);
    }
}
