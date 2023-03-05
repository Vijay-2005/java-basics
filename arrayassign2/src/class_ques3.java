public class class_ques3 {
    public static void main(String[] args) {
        int ans = 0 ;
        int []arr = { 1,2,3,4,6,5,4,8,8,4};
        for( int i = 0 ; i < arr.length; i++){
            if ( arr[i] == 4 ){
                ans++ ;
            }
        }
        System.out.println(ans);
    }
}
