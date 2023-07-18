 import java.util.*;
public class DecimalComparator {
    public static  boolean compare(double a , double b){
        String String_value_a = String.valueOf(a);
        String String_value_b = String.valueOf(b);
        for (int i = 0 ; i < 5 ; i++){
           if (String_value_a.charAt(i) != String_value_b.charAt(i)){
                return false;
            }
        }
        return true ;
    }
    public static void main(String[] args) {
       boolean ans = compare(8.975656,8.9744846);
        System.out.println(ans);


    }
}
