import java.util.Arrays;

public class assign3 {
    static int MinimumPlatform( int[] arrive, int[] departure){
       int arrive_index =  0 ;
       int departure_index = 0 ;
       int Platform_needed = 0 ;
       int Max_platform = 0 ;
        Arrays.sort(arrive);
        Arrays.sort(departure);
        while (arrive_index < arrive.length){
            if ( arrive[arrive_index] <= departure[departure_index] ){
                Platform_needed++;
                arrive_index++;
            }else {
                Platform_needed--;
                departure_index++;
            }
            Max_platform = Math.max(Max_platform,Platform_needed);
        }
    return  Max_platform;}
    public static void main(String[] args) {


     int    arr[] = {900, 940};
        int    dep[] = {910, 1200};

        System.out.println(MinimumPlatform(arr,dep));
    }
}
