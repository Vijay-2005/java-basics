import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("type your number");
//        int n = sc.nextInt();
//        int num = 1 ;
//        int sum = 0;
//        while( num <= n){
//            System.out.println(sum);
//            sum = num + sum ;
//            num++;
//        }
//        System.out.println(sum);
//        problem on loops
//pgno 4 on loops notes
//        int i = 1 ;
//        while ( i <= 100){ if(i % 3 == 0 && i % 5==0 ){
//            System.out.println("fizzBuzz");
//        } else{ if(i % 3 == 0){
//            System.out.println("fizz");
//        } else if (i % 5==0 ) {
//            System.out.println("buzz");
//
//        }else {
//            System.out.println(i);
//        }
//        }
//        i++;
//
//        }
//        loops lecture problem set1
        int num = 0 ;
        System.out.println("type your number");
        int n = sc.nextInt();
        while(n > 0 ){
            n = n/10 ;
            num++ ;
        }
        System.out.println(num);
    }
}
