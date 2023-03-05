public class class_ques4 {
    public static void main(String[] args) {
        String ans = " sorted";
        int []arr = {  1,2,3,4,5,5,5,6};
        for( int i = 1 ; i < arr.length;i++){
            if( arr[i-1] <= arr[i] ){
                ans  = " sorted";
            }else {
                ans = " not sorted ";
                break;
            }
        }
        System.out.println(ans);

    }
}
