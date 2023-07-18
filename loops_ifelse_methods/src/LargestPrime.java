public class LargestPrime {
    public static int  getLargestPrime(int number){
        int largest_prime = 0 ;
        int Not_prime = 0 ;
        if(number <= 1 ){
            return - 1;
        }
        for (int i = 2 ; i <= number; i++){
            if(number%i== 0){//Then this code is for to check number factor.
                for(int j = 2 ; j <= i/2;j++){//this code is for check number is prime or not
                    if(i%j == 0){
                        Not_prime = 1 ;
                        break;
                    }

                }
                if (Not_prime == 0 ){
                    largest_prime = Math.max(largest_prime,i);
                }
                Not_prime = 0 ;
            }
        }
  return largest_prime;  }

    public static void main(String[] args) {
        int ans = getLargestPrime(2);
        System.out.println(ans);
    }


}