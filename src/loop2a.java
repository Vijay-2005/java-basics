import  java.util.Scanner;
public class loop2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type your number");
//        int num = 0 ;
//        int ans = 0;
//        int n = sc.nextInt();
//        while (n >0 ){
//            num = n %10;
//            n = n / 10;
//            ans = ans*10 + num;
//
//        }
//        System.out.println(ans);
        System.out.println("type the value of n");
        int n = sc.nextInt();
        int sum = 0 ;

        while( 0 < n ){
            if(n%2 ==0) { sum -=n ;
                n--;

            }
            else{
                sum += n ;
                n--;

            }
        }
        System.out.println(sum);
    }
}
