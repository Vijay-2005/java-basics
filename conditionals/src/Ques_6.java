import java.util.*;
public class Ques_6
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks;
        System.out.print("Enter the marks : ");
        marks=sc.nextInt();
        if(marks>=90)
        {
            System.out.print("Your Grade is A+");
        }else if(marks>=80)
        {
            System.out.print(" Grade is A");
        }else if(marks>=70)
        {
            System.out.print(" Grade is B+");
        }else if(marks>=60)
        {
            System.out.print("Grade is B");
        }else if(marks>=50)
        {
            System.out.print(" Grade is C");
        }else if(marks>=40)
        {
            System.out.print(" Grade is D");
        }else if(marks>=30)
        {
            System.out.print(" Grade is E");
        }else if(marks<30){
            System.out.print("Your Grade is f");
        }else{
            System.out.print("Enter valid marks");
        }
    }
}
