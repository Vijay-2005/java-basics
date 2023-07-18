

public class shared_digit {
    public static boolean hasSharedDigit(int number_1, int number_2){
        if (number_1 >= 10 && number_1 <= 99 && number_2 >= 10 && number_2 <= 99) {

            int array_1[] = new int[2];

            array_1[1] = number_1%10;
            number_1 = number_1/10;
            array_1[0] = number_1;
            int array_2[] = new int[2];

            array_2[1] = number_2%10;
            number_2 = number_2/10;
            array_2[0] = number_2;
          for ( int i = 0 ; i < 2 ; i++){
              for (int j = 0 ; j < 2 ; j++){

                  if (array_1[i] == array_2[j]){
                      return true ;
                  }
              }
          }


        } else return false ;
   return false; }

    public static void main(String[] args) {
      boolean ans =  hasSharedDigit(56,69);
        System.out.println(ans);
    }
}
