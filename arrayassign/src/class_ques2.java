//search the given elements x int array if present then return the index else return -1;
public class class_ques2 {
    public static void main(String[] args) {
        int  x = 9 ;
        // here we initialise the ans by -1;
        int ans = -1;
        int arr[] = { 1,2,3,6,9,12,14,9};
        for(int i = 0 ; i < arr.length; i++){
            if( x == arr[i]){
                ans = i ;
                break;//here we are using break because we want first occurence result;

            }
        }
        System.out.println(ans);
    }
}
