public class FlourPacker {
    public static boolean canPack(int bigCount,int smallCount,int goal){
       if (bigCount< 0 || smallCount < 0 || goal < 0) {
       return false;
  }
       int bigCountNeeded = goal/5;
       if ( bigCountNeeded <= bigCount){
           goal = goal - bigCount*5;

       }else goal = goal - bigCount*5;


  return goal<=smallCount;  }





}
