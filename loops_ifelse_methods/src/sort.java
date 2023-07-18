import java.util.Arrays;

public class sort {
    public static int[] sorting(int[] array ){
        int[] final_array = new int[array.length] ;
        int number = 0 ;
        int index = 0 ;
        for ( int i = 0 ; i < array.length;i++){
            for ( int j = 0 ; j < array.length; j++){
                if( number < array[j]){
                    number = array[j];
                    index = j;
                }else {
                    number = number;
                }
            }

            final_array[i] = number;
            number = 0;
            array[index] = 0 ;
            index = 0 ;


        }


   return  final_array; }
    public static void main(String[] args) {
        int array[] = { 1,2,9,5,7};
      array =   sorting(array);
        System.out.println(Arrays.toString(array));

    }
}
