import java.util.Scanner;

//Given an array sorted in increasing order of size n and an integer x, find if there exists a
//pair in the array whose absolute difference is exactly x.(n>1)
public class AssignQues1 {

    static String difference_of_two_numbers(int[] array, int x ){
        for (int i = 0 ; i < array.length;i++){
            for( int j = i + 1; j < array.length; j++){
                if (  array[j]-array[i] == x){
                    return "yes";



                }
            }
        }
    return "no" ;}
    public static void main(String[] args) {
        System.out.println(" enter array size ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0 ; i < n; i++){
            array[i] = sc.nextInt();
        }
        System.out.println(" which number difference you want");
        int  y = sc.nextInt();
        String answer = difference_of_two_numbers(array, y);
        System.out.println(answer);

    }
}
