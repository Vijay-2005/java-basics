public class ques5 {
    public static void main(String[] args) {
        boolean ans = true;
        int []arr_1 = { 2,5,7,9,13};
        int []arr_2 = {2,5,7,9,13};

for ( int i = 0 ; i < arr_1.length;i++){
   if (  arr_1[i] == arr_2[i]){
       ans = true;

   }else ans = false;


}
        System.out.println(ans);
    }
}
