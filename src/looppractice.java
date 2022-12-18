import java.util.Scanner;
public class looppractice {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println(" type rows");
         int r = sc.nextInt( );
        System.out.println(r);
//        for ( int i = 1 ; i <= r ; i++){
//            for ( int j = 1 ; j <=  r - i ; j++){
//                System.out.print(" ");
//
//            }
//            for ( int k = 1 ; k <= 2*i - 1 ; k++ ){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//question 2

//        for ( int  i = 1 ; i <= r ; i++ ){
//           for ( int j = 1; j <= r ; j++){
//                if( i == 1 || i == r || j ==1 || j == r ) System.out.print(j);
//                else System.out.print(" ");
//            }
//
//            System.out.println();
//       }
//question 3
        System.out.println(" write column");
        int c = sc.nextInt();
        System.out.println(c);
// for ( int i = 1 ; i <= r ; i++ ){
//         for (int j = 1 ; j <= c ; j++){
//             if ( (i + j )%2 == 0  ) System.out.print(1);
//             else System.out.print(2);
//         }
//     System.out.println();
// }

//question 4

for ( int i = 1 ; i <= r ; i++){
    for (int j = 1 ; j <= r-i ; j++){
        System.out.print(" ");}
        for ( int k = 1 ; k <= i ; k++){
            System.out.print( k  );
        }
        for ( int m = i - 1  ; m >= 1 ; m--){
            System.out.print(m);
        }
    System.out.println();

}





    }
}
