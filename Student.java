package schoolmanagementsystem;

public class Student {

    private int numberOfStudents; // private because it is not used outside the class
    private String nameOfStudent;
    private int gradeOfStudent;
    private int feesPaid;
    private int feesTotal;
    private String TypeOfEducation;

    /*
        * To create a new student object we need to initialize
        @param numberOfStudents - unique id for the student
    */

    public Student(int numberOfStudents, String nameOfStudent, int gradeOfStudent, String TypeOfEducation) {
        this.numberOfStudents = numberOfStudents;
        this.nameOfStudent = nameOfStudent;
        this.gradeOfStudent = gradeOfStudent;
        this.feesPaid = 0;
        this.TypeOfEducation = TypeOfEducation;
        this.feesTotal = getFeesTotal(TypeOfEducation);

    }
    
    // get the fees paid switch case of type of education
    public int getFeesTotal(String TypeOfEducation) {
        switch (TypeOfEducation) {
            case "Primary":
                feesTotal = 100000;
                break;
            case "Secondary":
                feesTotal = 200000;
                break;
            case "Tertiary":
                feesTotal = 300000;
                break;
            default:
                feesTotal = 1000000;
                break;
        }
        return feesTotal;
    }

    public void changeFeesPaid(int feesPaid) {
        this.feesPaid += feesPaid;
                }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public int getGradeOfStudent() {
        return gradeOfStudent;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public String getTypeOfEducation() {
        return TypeOfEducation;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public void setGradeOfStudent(int gradeOfStudent) {
        this.gradeOfStudent = gradeOfStudent;
    }

    public void setFeesPaid(int feesPaid) {
        this.feesPaid = feesPaid;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public void setFeesTotal(int feesTotal) {
        this.feesTotal = feesTotal;
    }

    public void setTypeOfEducation(String typeOfEducation) {
        TypeOfEducation = typeOfEducation;
    }
    
    
}
