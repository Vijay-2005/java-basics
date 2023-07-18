public class sumFirstsAndLastDigit {
    public static int sum(int number ){
        if ( number > 0){
            int last_digit = number%10;
            while (number >= 10){
                number = number/10;
            }
            int sum = last_digit + number ;
            return sum ;
        }else if (number < 0){
            return -1 ;
        }
        return  0 ; }

    public static void main(String[] args) {
       int ans = sum(0);
        System.out.println(ans);
    }
}
