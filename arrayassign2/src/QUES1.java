import java.util.Scanner;


class  solution{
      public   void array_input( int[] array ){

          for( int i = 0 ; i < array.length; i++) {
              if (array[i] >= 0) {
                  System.out.print(array[i] + " ");
              }
          }
          for( int i = 0 ; i < array.length; i++){
              if (array[i] < 0){
                  System.out.print(array[i]+" ");
              }
          }
      }

}
public class QUES1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" write number of elements in array");
        int m = sc.nextInt();
        int []array  = new int[m];
        for( int i = 0 ; i < m; i++){
            array[i] = sc.nextInt();
        }
        for( int i = 0 ; i < m; i++){
            System.out.print(array[i]+" " );
        }
        System.out.println();
        solution obj = new solution();// here we are making object for calling method
        obj.array_input(array);

    }
}