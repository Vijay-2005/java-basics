//calculate the maximum value of array.
public class class_ques1 {
    public static void main(String[] args) {
         int ans = 0 ;
         int []arr = { 1 , 5 ,3 };
         for (int i = 0 ; i < arr.length; i++){
             if(ans > arr[i]){
                 ans = ans ;
             }else  {
                 ans = arr[i];
             }

         }
        System.out.println(ans);
    }
}
