package schoolmanagementsystem;

public class Teacher {
    
        private int numberOfTeachers;
        private String nameOfTeacher;
        private int salaryOfTeacher;
    
        public Teacher(int numberOfTeachers, String nameOfTeacher, int salaryOfTeacher) {
            this.numberOfTeachers = numberOfTeachers;
            this.nameOfTeacher = nameOfTeacher;
            this.salaryOfTeacher = salaryOfTeacher;
        }
    
        public int getNumberOfTeachers() {
            return numberOfTeachers;
        }
    
        public String getNameOfTeacher() {
            return nameOfTeacher;
        }
    
        public int getSalaryOfTeacher() {
            return salaryOfTeacher;
        }

        public void setNumberOfTeachers(int numberOfTeachers) {
            this.numberOfTeachers = numberOfTeachers;
        }

        public void setNameOfTeacher(String nameOfTeacher) {
            this.nameOfTeacher = nameOfTeacher;
        }

        public void setSalaryOfTeacher(int salaryOfTeacher) {
            this.salaryOfTeacher = salaryOfTeacher;
            School.updateTotalMoneySpent(salaryOfTeacher);
        }

        public void revertSalaryOfTeacher(int salaryOfTeacher) {
            this.salaryOfTeacher += salaryOfTeacher;
            School.updateTotalMoneySpent(salaryOfTeacher);
        }



    
       
    
    
}
