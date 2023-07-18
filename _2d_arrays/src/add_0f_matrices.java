import java.util.Scanner;

public class add_0f_matrices {
    static void add_matrices(int[][] array_1,int[][] array_2,int r, int c){
        int[][] array = new int[r][c];
      for ( int i = 0 ; i < array_1.length;i++){
          for ( int j = 0 ; j < array_1[i].length;j++){
              array[i][j] = array_1[i][j]+array_2[i][j];
          }
      }
        System.out.println("final added matrices");
      Main.print_2d_array(array);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type no of rows of  Matrix 1 :");
        int r = sc.nextInt();
        System.out.println("type no of columns of matrix 2 :");
        int c = sc.nextInt();

        System.out.println("type all "+r*c+ " elements of Matrix_1:");
        int[][]  array_1 = new int[r][c];
        for ( int i = 0; i < r ; i++){
            for ( int j = 0 ; j < c ; j++){
                array_1[i][j]  = sc.nextInt();
            }
        }
        Main.print_2d_array(array_1);


        System.out.println("type all "+r*c+ " elements of Matrix_2:");
        int[][]  array_2 = new int[r][c];
        for ( int i = 0; i < r ; i++){
            for ( int j = 0 ; j < c ; j++){
                array_2[i][j]  = sc.nextInt();
            }
    }
        Main.print_2d_array(array_2);
        add_matrices(array_1,array_2,r,c);
}}
