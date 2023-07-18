public class swach {
    public static void main(String[] args) {
     int switch_value = 4 ;
     switch (switch_value){
         case 1 -> System.out.println("value is i " );
         case 2 -> System.out.println("value is 2 ");
         case  3 ,4 , 5 -> System.out.println("value is 3 , 4 or 5 ");
         case 6,7,8 -> {
             System.out.println("value is 6,7 or8 ");
             System.out.println("Actually it was " + switch_value);
         }
         default -> System.out.println("number is invalid");
     }
     String month = "november" ;
//     getQuarter(month);
        System.out.println(month + " is in " +getQuarter(month) + "quater" );

    }
    public static String getQuarter(String month){
//        String month = null;
        return  switch ( month){
            case "january" , "february" , "March" -> " 1st";
            case "April" , "may", "june" -> " 2nd";
            case "july" , "august", "September" -> " 3rd";
            case "october", "november", "december" -> " 4th";
            default -> "month is invalid";


        };

    }
}
