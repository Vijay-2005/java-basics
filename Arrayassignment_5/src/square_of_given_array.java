import java.util.*;
public class square_of_given_array {
    static void reverse(int[] array ){
        int j = array.length-1 ;
        for ( int i = 0 ; i < array.length/2 ; i++,j--){
            sorting.swap(array,i,j);
        }
    }

    static int[] square_array( int[] array){
      int left = 0 ; int right = array.length-1;
      int[] ans = new int[array.length];
      int k = 0 ;
      while( left <= right){
          if ( Math.abs(array[left])  > Math.abs(array[right])){
              ans[k++] = array[left]*array[left];
              left++;
          }else {
              ans[k++] = array[right]*array[right];
              right--;
          }
      }
   return ans ; }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type the number of elements in array");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println(" type each elements of array");
        for (int i = 0 ; i< array.length ; i++){
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
         array = square_array(array);
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
}
