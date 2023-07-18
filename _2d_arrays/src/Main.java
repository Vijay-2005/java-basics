import java.util.Scanner;

public class Main {
    static void print_2d_array( int[][] array){
        for ( int i = 0 ; i< array.length;i++){
            for( int j = 0 ; j< array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        int[][] array = new int[2][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("type no of rows in array :");
        int r = sc.nextInt();
        System.out.println("type no of columns in array :");
        int c = sc.nextInt();

        System.out.println("type all "+r*c+ " elements of array :");
        int[][]  array = new int[r][c];
        for ( int i = 0; i < r ; i++){
            for ( int j = 0 ; j < c ; j++){
                 array[i][j]  = sc.nextInt();
            }
        }
       print_2d_array(array);
    }
}