//check the element is present in array or not in more than one queries;
import java.util.Scanner;

public class class_ques6 {
    static int[] make_frequency_array(int[] array){
        int []frequency = new int[100001];
        for (int i = 0 ; i < array.length;i++){
          frequency[array[i]]++;//don't make a mistake in brackets
        }
 return frequency;   }
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        System.out.print("how many elements you like in array ;");
        int n = sc.nextInt();
        int []array = new int[n];
        System.out.println("type the each elements in array");
        for (int i = 0 ; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("how many many times you find an element in array");
        int k = sc.nextInt();
        int[] freq = make_frequency_array(array);//here we make all value one which is present in elements indexes;
while(k > 0){
    System.out.println("which element you want to search");
    int x = sc.nextInt();
    if ( freq[x] > 0 ){
        System.out.println("yes");

    }else System.out.println("No");
    k--;
}
 }
}
