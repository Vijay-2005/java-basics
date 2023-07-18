import org.w3c.dom.ls.LSOutput;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num_1,int num_2 , int num_3){
        if ( num_1 > 9 && num_1 < 1001 && num_2 > 9 && num_2 < 1001 && num_3 > 9 && num_3 < 1001  ){
         if ( num_1%10 == num_2%10 || num_1%10==num_3%10 || num_2%10==num_3%10){
             return true;
         }
        }
          return false; }
    public static  boolean isValid(int number){
        if (number > 9 && number < 1001){
            return true;
        }
    return false;}


}
