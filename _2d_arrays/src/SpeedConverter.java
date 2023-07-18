public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour<0){
            return -1 ;
        }else {
            double ans = (kilometersPerHour)/1.609;
            return (long)ans;
        }

    }
    public static void printConversion(double kilometersPerHour){
        if ( kilometersPerHour < 0 ){
            System.out.println( "Invalid Value");
        }else {
            double ans = ((kilometersPerHour))/1.609;
            System.out.println(kilometersPerHour+" km/h"+" = "+Math.round(ans)+" mi/h");
        }

    }

    public static void main(String[] args) {
        printConversion(55.75);
    }


    }

