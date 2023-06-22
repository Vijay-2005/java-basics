import java.util.*;
public class query{
    static void freq( int[] array){
        int[] freq = new int[100005];
        for (int i = 0 ; i < array.length; i++){
            freq[array[i]]++;
        }
    }
    static void swap(int[] array ,int i , int j ){
        int temp = array[i];
         array[i] = array[j];
         array[j] = temp;
    }
    static void reverse(int[] array, int srt,int end){
        int j = end ;
        for (int i = srt ; i <= array.length/2 ; i++,j--){
            swap(array,i ,j );
        }
         System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" type no of elements in array");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("type elements of array");
        for ( int i = 0 ;i < array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("what is the value of k ");
        int k = sc.nextInt();

        freq(array);
        while (k >0){
            System.out.println("no to be searched");
             n = sc.nextInt();
            k--;
            if ( array[n] > 0 ){
                System.out.println("yes");
            }else System.out.println("no");

        }

    }
}