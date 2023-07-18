import java.util.Scanner;



public class sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("tell me length of array you want");
        int  n = sc.nextInt();
        int array_1[] = new int[n] ;
        System.out.println("type elements of array");
        for (int i = 0 ; i < n ; i++){
            array_1[i] = sc.nextInt();
        }
        for (int i = 0 ; i < array_1.length; i++){
            System.out.print( " " +array_1[i]) ;
        }
        int ans = 0 ;
        for (int i = 1 ; i < array_1.length-1 ; i++){
            if (array_1[i] >array_1[i -1] && array_1[i] < array_1[i+1]){
            }else{
                System.out.println();
                System.out.println("array is not sorted");
            System.exit(0);}

        }
        System.out.println();
        System.out.println("array is sorted");

    }
    }

