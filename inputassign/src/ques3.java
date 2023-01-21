import java.util.Scanner;
public class ques3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("marks of physics");
        int Physics = scn.nextInt();
        System.out.println("Write marks of chemistry");

        int Chemistry= scn.nextInt();
        System.out.println("Write marks of Maths");
        int Maths = scn.nextInt();
        int total_marks =Physics + Chemistry+ Maths;
        int percentage = (total_marks / 3);
        System.out.println(total_marks);
        System.out.println(percentage + "%");
    }
}
