public class practice {
    public static boolean isLeapYear (int year){
        if ( year > 0 && year < 9999){
            if(year%100 == 0){
                if(year%400==0){
                    return true ;
                }else return false;
            }else if( year%4==0){
                return true;
            }else    return false;
        } else {
            return false;
        }
}
    public static int getDaysInMonth(int month , int year) {
        if (month < 1 || month > 12) {
            return -1;
        }
        if (year < 1 || year > 9999) {
            return -1;
        }
        if (isLeapYear(year)) {
            if (month == 2) {
                return 28;
            } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){

                    return 31;

            }else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    return 30;
                }


         else {
            if (month == 2) {
                return 29;
            } else {
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                    return 31;
                }
            }else{
                if (month == 4 || month == 6 || month == 9 || month == 11) {
                    return 30;
                }

            }
            public static void main (String[]args){


            }
        }
    }