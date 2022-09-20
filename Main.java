package schoolmanagementsystem;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Teacher teacher1 = new Teacher(1, "Mr. Mohamed", 706);
        Teacher teacher2 = new Teacher(2, "Mr. Ahmed", 760);
        Teacher teacher3 = new Teacher(3, "Mr. Ali", 00);
        Teacher teacher4 = new Teacher(4, "Mr. Hossam", 700);
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        teachers.add(teacher4);

        Student student1 = new Student(1, "Bn ali khalid al saud", 4, "Primary");
        Student student2 = new Student(2, "Bn mohammed khalid al saud", 5, "Secondary");
        Student student3 = new Student(3, "Bn abdullah khalid al saud", 6, "Tertiary");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        students.get(0).setFeesPaid(60000);


        School school = new School(teachers, students);
        System.out.println("School has earned " + school.getTotalMoneyEarned());
        System.out.println("School has spent " + school.getTotalMoneySpent());



    }
    
}
