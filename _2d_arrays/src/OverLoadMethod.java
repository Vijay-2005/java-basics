public class OverLoadMethod {
    public static double convertToCentimeter(int height ){
        return (double)(height*2.54) ;

    }
    public static double convertToCentimeter(int height_foot ,int height_inches  ){
        int ans = height_inches + height_foot*12;
         double  final_ans =  convertToCentimeter(ans);
        return (double)(final_ans);


    }
    public static void main(String[] args) {
 double ans =convertToCentimeter(5,6);
        System.out.println(ans);
    }
}
