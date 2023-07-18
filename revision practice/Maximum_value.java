import java.util.Scanner;

public class Maximum_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tell me length of array you want");
        int  n = sc.nextInt();
        int array_1[] = new int[n] ;
        int ans = 0;
        System.out.println("type elements of array");
        for (int i = 0 ; i < n ; i++){
            array_1[i] = sc.nextInt();
        }
        for (int i = 0 ; i < array_1.length-1; i++){
            if (array_1[i] > array_1[i+1]){
                ans = array_1[i];
            }else ans = array_1[i+1];
        }
        System.out.println(ans);
    }
}
