class  algebra{
    double a;
    double b ;
    //here we are making a constructor in which we passes the two parameters.
    algebra(double x, double y){
        a =  x;
        b =  y;
    }
//It is a method of addition.
    public double addition(){
        return a+b ;
    }
    //It is a method of subtract.
    public double subtract(){
        return a-b ;
    }
    //It is a method of multiply.
    public double multiply(){
        return a*b  ;
    }
}
public class constructor {
    public static void main(String[] args) {
        //here we passed the  value of  x and y  to the constructor.Constructor use this values in methods.
        algebra obj = new algebra( 4,5);
        System.out.println( obj.addition());
        System.out.println(obj.subtract());
        System.out.println(obj.multiply());
    }

}
//basically constructor is used to assign a parameter at the time of object making;
