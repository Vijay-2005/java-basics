import java.util.Scanner;
 public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" type how many elements you like in array");
        int m = sc.nextInt();
        int arr[]= new int[m];
        for( int i = 0 ; i < m ; i++){
             arr[i] = sc.nextInt();
        }
        for ( int i = 0 ; i < m ; i++){
            System.out.print(arr[i] + " ");
        }


    }
}
