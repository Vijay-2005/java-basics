 class Employee {
    String name ;
    int YOJ ;
    int salary;
    String address;
}
public class ques5 {
    public static void main(String[] args) {
        Employee a = new Employee();
        a.name = "Robert";

        a.YOJ = 1996;
                a.salary = 1200;
        a.address = "bhel layout";

        Employee b =new Employee();
        b.name = "samem";
        b.YOJ = 1997;
        b.salary = 1300;
        b.address = "natioal institute";
        Employee c =new Employee();
        c.name = "sahil";
        c.YOJ = 1998;
        c.salary = 1100;
        c.address = "national institute of engineering";
        System.out.println("Name" +"\t"+"year of joining" + "\t" + "salary"+"\t"+ "address");
        System.out.println(a.name +"\t"+a.YOJ + "\t" + a.salary+"\t"+a.address );
        System.out.println(b.name +"\t"+ b.YOJ+ "\t" +b.salary +"\t"+b.address );
        System.out.println(c.name +"\t"+c.YOJ + "\t" +c.salary +"\t"+c.address );

    }
}
