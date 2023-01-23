import java.util.Scanner;

public class Ques5 {
    public int smallest(int a , int b , int c){
        if (a < c ) {
if ( a < b ){
    System.out.println(a + " is smallest");
}
        } else if ( c < b) {
            System.out.println( c +" is smallest");

        }else{
            System.out.println( b + " is smallest");
        }

        return a ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write first No.");
        int a = sc.nextInt();
        System.out.println("write second No.");
        int b = sc.nextInt();

        System.out.println("write third No.");
        int c = sc.nextInt();
        Ques5 obj = new Ques5();
        String ans = String.valueOf(obj.smallest( a ,b,c));
    }
}
