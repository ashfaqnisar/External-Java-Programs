public class StudentEvaluator extends StudentEvaluation {

    public static void main(String[] args){
        StudentEvaluation student1 = new StudentEvaluation(45,"Ashfaq");
        StudentEvaluation student2= new StudentEvaluation(46,"Nisar",2018);
        StudentEvaluation student3 = new StudentEvaluation(47,"Mohammed",2018,"CSE");

        System.out.println(student1+"\n");
        System.out.println(student2+"\n");
        System.out.println(student3+ "\n\n");

        student1.setBranch("It");
        student1.setYear(2017);

        student2.setBranch("Mech");

        System.out.println(student1+"\n");
        System.out.println(student2+"\n");
        System.out.println(student3+"\n");

        student1.getStudentName();
        student2.getStudentName();
        student3.getStudentName();


    }

}
