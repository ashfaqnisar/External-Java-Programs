public class StudentEvaluation {
    private String studentName,branch;
    private int studentId,year;

    public StudentEvaluation() {
    }

    public StudentEvaluation(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
    public StudentEvaluation(int studentId, String studentName, int year) {

        this.studentName = studentName;
        this.studentId = studentId;
        this.year = year;
    }

    public StudentEvaluation(int studentId, String studentName, int year, String branch) {
        this.studentName = studentName;
        this.branch = branch;
        this.studentId = studentId;
        this.year = year;
    }

    public String getStudentName() {
        System.out.println("The Name of the student is "+studentName);
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getBranch() {
        System.out.println("The Branch of the student is "+ branch);
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getStudentId() {
        System.out.println("The ID of the student is "+ studentId);
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getYear() {
        System.out.println("The Year of the student is "+ year);
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void evaluateTheStudent(){
    }

    @Override
    public String toString() {
        return "Student Details{ " + "The Name of student = " + studentName  +
                                            ",The  Branch of student is ='" + branch +
                                            ",The ID of the student is = " + studentId +
                                            ",The Year of the student is = " + year ;
    }
}
