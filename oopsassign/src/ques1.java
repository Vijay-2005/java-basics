//Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign
//the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
class student{
    String name ;
    int roll_no;
}
public class ques1 {
    public static void main(String[] args) {
        student obj_1 = new student();
        student obj_2 = new student();
        obj_1.name = "john";
        obj_2.roll_no = 2 ;
        System.out.println(obj_1.name);
        System.out.println(obj_2.roll_no);
    }
}
