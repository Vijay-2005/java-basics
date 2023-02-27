/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
creating a class named 'Triangle' without any parameter in its constructor.*/
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
class area{ int  a , b;
    //here we are making a constructor ;
    public area(int x, int y) {
        a = x ;
        b = y;
    }
    // here we are making  method for get area of rectangle .
    public int rectangle_area(){
        return a*b;
    }
}
public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write the value of x");
        int x = sc.nextInt();
        System.out.println("write the value of y ");
        int y = sc.nextInt();
        //object and constructor .
        area obj = new area( x,  y);
        System.out.println( " area of rectangle is " + obj.rectangle_area());
    }




}
