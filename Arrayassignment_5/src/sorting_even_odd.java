import java.util.* ;
public class sorting_even_odd {
//    static void swap( int[] array ,int  left ,int  right){
//        int temp =  array[left];
//        array[left] = array[right];
//        array[right] = temp;
//
//    }
    static void sorting_even_odd(int[] array){
        int left = 0 ;
        int right = array.length-1;
        while (left < right ){
            if ( array[left]%2 == 1 && array[right]%2 == 0){
                sorting.swap(array,left,right);
                right--;
                left++;
            }
            if( array[left]%2 == 0 ){
                left++;
            }if ( array[right]%2 == 1 ){
                right++;
            }
        }
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
        sorting_even_odd(array);
        System.out.println(Arrays.toString(array));
    }
}
