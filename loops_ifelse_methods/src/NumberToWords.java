public class NumberToWords {
    public static String numberToWords(int number) {
       number =  reverse(number);
        StringBuilder result = new StringBuilder();
       int last_digit = 0 ;
       while(number>0){
           last_digit = number%10 ;
           switch ( last_digit){
               case 0 -> System.out.print("Zero " );
               case 1 -> System.out.print("One ");
               case 2 -> System.out.print("Two ");
               case 3 -> System.out.print("Three ");
               case 4 -> System.out.print("Four ");
               case 5 -> System.out.print("Five ");
               case 6 -> System.out.print("Six ");
               case 7 -> System.out.print("Seven ");
               case 8 -> System.out.print("Eight ");
               case 9 -> System.out.print("Nine ");
           }
           number = number/10 ;
       }


        return result.toString();
    }

    public static int reverse(int number){
        int reverse_number = 0 ;
        int last_digit = 0 ;
        while(number>0){
            last_digit = number%10 ;
            reverse_number = reverse_number*10+ last_digit;
            number = number/10;
        }
        return reverse_number;
    }
    public static int getDigitCount( int number){
        if(number < 0){
            return -1;
        }
        int count = 0 ;
while(number>0){
    number = number/10 ;
    count++;
}
  return  count;  }

    public static void main(String[] args) {
//      int ans =   getDigitCount(100);
//        System.out.println(ans);
//        int ans = reverse(100);
//        System.out.println(ans);
String ans = numberToWords(5200);
        System.out.println( ans);


    }
}
