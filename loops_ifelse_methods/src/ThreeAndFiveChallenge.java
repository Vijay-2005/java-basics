public class ThreeAndFiveChallenge {
    public static void main(String[] args) {
        int count = 0 ;
        int sum = 0 ;
        for (int i = 1 ; i < 1000 ; i++){


            if(count != 5 ){
                if ( (i%3 == 0 ) && ( i%5==0) ){
                    System.out.println( " " + i);
                    sum += i;
                    count++ ;
                }

            }else {
                System.out.println( "sum of these numbers "  +  sum);
                return;
            }
        }
    }
}
