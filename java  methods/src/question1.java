 import java.util.Scanner ;


public class question1 {
//    here we make  a method
    public  int average(int a ,int b , int c){
        int ans = (a+b+c)/3;
        return ans ;
    }


    public static void main(String[] args) {
//        here we  write a code of input
        Scanner sc = new Scanner(System.in);
        System.out.println("write a ");
        int a = sc.nextInt();
        System.out.println("write b ");
        int b = sc.nextInt();
        System.out.println("write c ");
        int c = sc.nextInt();
        question1 obj = new question1();
        int ans = obj.average( a , b , c );
        System.out.println(ans);



    }

}
