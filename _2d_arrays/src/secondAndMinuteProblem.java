public class secondAndMinuteProblem {
    public static String getDurationString(int seconds){
int minutes = seconds/60;
int hours = minutes/60;
int remaining_minutes  = minutes%60 ;
int remaining_seconds = seconds%60;
return hours + "h " + remaining_minutes + "m "+remaining_seconds+"s";

    }

    public static String getDurationString(int minutes,int seconds){
        int hours = minutes/60;
        int remaining_minutes  = minutes%60 ;
        int remaining_seconds = seconds%60;
        return hours + "h " + remaining_minutes + "m "+remaining_seconds+"s";
    }
public static void main(String[] args) {
   String ans =  getDurationString(3945
   );
    System.out.println(ans);
    String ans_2 = getDurationString( 65 ,  45);
    System.out.println(ans_2);
}
}
