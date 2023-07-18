public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }
        int common_factor = 0;
        for (int i  = 1 ; i <= first && i <= second; i++){
            if (first%i == 0 && second%i == 0){
                common_factor = i ;
            }
        }
  return common_factor;  }

    public static void main(String[] args) {
        int ans = getGreatestCommonDivisor(1010,10);
        System.out.println(ans);

    }


}
