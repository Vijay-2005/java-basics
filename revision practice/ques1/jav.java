package ques1;
import java.util.Scanner;
import java.util.Arrays;

public class jav {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tell me length of array you want");
        int  n = sc.nextInt();
        int array_1[] = new int[n] ;
        System.out.println("type elements of array");
        for (int i = 0 ; i < n ; i++){
            array_1[i] = sc.nextInt();
        }
        int array_2[] = new int[n];
        int  j = 0 ;
        for (int i = 0 ; i < n ; i++){
            if ( array_1[i] > 0){

                array_2[j] = array_1[i];
                j++;
            }

        }
        for (int i = 0 ; i < n ; i++){
            if(array_1[i] < 0 ){


                array_2[j] = array_1[i];
                j++;

            }
        }
        System.out.println(Arrays.toString(array_2));

    }
}
