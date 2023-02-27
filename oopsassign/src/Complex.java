import java.util.Scanner;
public class Complex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type real part of 1st complex number");
        int a = sc.nextInt();
        System.out.println("type imaginary part of 1st complex number");
        int b = sc.nextInt();
        System.out.println("type real part of 2nd complex number");
        int c = sc.nextInt();
        System.out.println("type imaginary part of 2nd complex number");
        int d = sc.nextInt();
        int m = a+c;
        System.out.println( "real part of complex number after adding is "+m);
        int n = b+d;
        System.out.println("imaginary part of complex number after adding is "+n);
        if(m == 0 && n != 0){
            System.out.println(b+d+"i");
        } else if (m != 0 && n == 0 ){
            System.out.println(a+c);

        }else System.out.println( "complex number after adding is "+m+"+"+n+"i");

    }
}