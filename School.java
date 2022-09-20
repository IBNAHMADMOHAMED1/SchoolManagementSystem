package schoolmanagementsystem;

import java.util.List;

public class School {

    private List<Teacher> theacher;
    private List<Student> student;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teacher> theacher, List<Student> student) {
        this.theacher = theacher;
        this.student = student;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    public List<Teacher> getTheacher() {
        return theacher;
    }

    public void setTheacher(List<Teacher> theacher) {
        this.theacher = theacher;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

   

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    
    public void createTeacher(Teacher teacher) {
        theacher.add(teacher);
    }
    
    public void createStudent(Student student ) {
        this.student.add(student);
    }
    
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }
    
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent; // money spent that is salary given to teachers
    }

  
    
}
