import java.util.Scanner;
import java.util.Arrays;
public class araray {
    public static void main(String[] args) {
//        int []array_1 = { 8,9,7,6,5,3};
//        System.out.println(array_1[3]);
        Scanner sc = new Scanner(System.in);

        System.out.println("tell me length of array you want");
        int  n = sc.nextInt();
        int array_1[] = new int[n] ;
        System.out.println("type elements of array");
        for (int i = 0 ; i < n ; i++){
             array_1[i] = sc.nextInt();
        }


        for (int i = 0 ; i < array_1.length; i++){
            System.out.print( " " +array_1[i]);
        }
        System.out.println(Arrays.toString(array_1));
    }
}
