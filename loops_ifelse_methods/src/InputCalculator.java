import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner sc = new Scanner(System.in);
        int sum = 0 ;
        int count = 0 ;


        while (true){
            boolean ans = sc.hasNextInt();
            if(ans){
                int number = sc.nextInt();
                sum += number;
                count++;
            }else {
                break;
            }

        }
        if (count > 0){
            long average = Math.round((double) sum/count);
            System.out.println("SUM = "+sum+ " AVG = "+average );

        }else {
            System.out.println("SUM = "+"0"+ " AVG = "+  "0" );
        }



    }

}
