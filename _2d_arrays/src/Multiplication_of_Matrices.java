import java.util.Scanner;

public class Multiplication_of_Matrices {
    static void Multiplication(){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type no of rows of  Matrix 1 :");
        int r = sc.nextInt();
        System.out.println("type no of columns of matrix 1 :");
        int c = sc.nextInt();

        System.out.println("type all "+r*c+ " elements of Matrix_1:");
        int[][]  array_1 = new int[r][c];
        for ( int i = 0; i < r ; i++){
            for ( int j = 0 ; j < c ; j++){
                array_1[i][j]  = sc.nextInt();
            }
        }
        Main.print_2d_array(array_1);
        System.out.println("type no of rows of  Matrix 2 :");
        int r2 = sc.nextInt();
        System.out.println("type no of columns of matrix 2 :");
        int c2 = sc.nextInt();
        System.out.println("type all "+r2*c2+ " elements of Matrix_2:");
        int[][]  array_2 = new int[r2][c2];
        for ( int i = 0; i < r2 ; i++){
            for ( int j = 0 ; j < c2 ; j++){
                array_2[i][j]  = sc.nextInt();
            }
        }
        Main.print_2d_array(array_2);

    }
    }

