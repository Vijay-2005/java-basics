import java.util.Scanner;

//Q3. You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints
//        of the ith line are (i, 0) and (i, height[i]).
//        Find two lines that together with the x-axis form a container, such that the container contains the most water.
//        Return the maximum amount of water a container can store.
public class Assign_Ques3 {
    static void max_area( int[] array){
        int maximum_area = 0 ;
        for (int i= 0 ; i < array.length;i++){
            for ( int j = i ; j < array.length;j++){
                int min = Math.min(array[i] , array[j]);
                 int area = min*(j-i);
                 maximum_area = Math.max(maximum_area,area);

            }
        }
        System.out.println("Maximum area of container :"+maximum_area);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type the number of elements in array");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println(" type each elements of array");
        for (int i = 0 ; i< array.length ; i++){
            array[i] = sc.nextInt();
        }
        max_area(array);

    }
}
