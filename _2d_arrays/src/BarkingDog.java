public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay ){
        if ( barking){
            if ( (hourOfDay < 8 && hourOfDay >0) ||   (hourOfDay < 24 && hourOfDay >22)){

                return true;
            }else {

                return false;
            }

        }else {
            System.out.println("dog is not barking");
        }
   return false; }


}
