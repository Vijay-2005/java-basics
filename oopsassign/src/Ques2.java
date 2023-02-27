
/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
        creating a class named 'Triangle' without any parameter in its constructor.*/
class triangle{
    int a ,b,c;
    //here we are making a methods which used in main function
    // it is the method for perimeter and return of it is formula of perimeter
   public double get_perimeter(){

       return a+b+c;
   }
   // here we are making the methods for area ;
   public double get_area(){
       double s = (a+b+c)/2.0;
       return Math.pow((s*(s-a)*(s-b)*(s-c)),0.5);
   }
}
public class Ques2 {
    public static void main(String[] args) {
        // now we are making  object by which we can call the methods what we wrote before;
        triangle t = new triangle();
// now we are give the value of our variable which we used for calculate area and perimeter;
        // for assign a value we use t.var = value;
       t.a = 3;
       t.b = 4;
       t.c = 5 ;
        // In print  we are call the method ;
        System.out.println(t.get_area());
        System.out.println(t.get_perimeter());

    }
}
