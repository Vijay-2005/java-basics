import java.util.Scanner;
public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("write a number");
//        int x  = sc.nextInt();
//        if( x % 2 == 0){
//            System.out.println("even");
//        }else {
//            System.out.println("odd");}
        int flag = 0;
        if (flag == 1) {
            System.out.println("hello");
            flag = 0;
        } else if (flag == 0) {
            System.out.println("world");
        } else {
            System.out.println("there");
        }
//        assignment
//        answer 1
        System.out.println("write length");
        int length = sc.nextInt();
        System.out.println("write breadth of your rectangle ");
        int breadth = sc.nextInt();
        if (length == breadth) {
            System.out.println("it is a square");
        } else {
            System.out.println("it is a rectangle");}
//                answer 2
            System.out.println("write your number");
            int number = sc.nextInt();
            if (number > 0) {
                System.out.println(number);
            } else {
                System.out.println(number * (-1));

            }
//            answer 5
        System.out.println("enter two number");
            int num_1 = sc.nextInt();
            int num_2 = sc.nextInt();
        System.out.println("enter operator");
        int operator = sc.nextInt();
        switch (operator){
            case'+':
                System.out.println( num_1 + num_2);
                break;
            case'-':
                System.out.println( num_1 - num_2);
            case'*' :
                System.out.println( num_1*num_2);
            case '/':
                System.out.println( num_1/num_2);
//                answer 5 is not runnning  because of exception in thread
        }
        }
    }

