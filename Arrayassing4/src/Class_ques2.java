import java.util.Scanner;

// swap two integer without using tertiary variable'
public class Class_ques2 {
    static void swap(int a , int b ){


        a = a + b ;//14
        b = a - b ;//5
        a = a - b ;//9
        System.out.println(" value of a after swap : " + a );
        System.out.println(" value of b after swap : " + b );

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type value of a ");

        int a = sc.nextInt();
        System.out.println("type value of b");
        int b = sc.nextInt();
        swap(a,b);



    }
}
