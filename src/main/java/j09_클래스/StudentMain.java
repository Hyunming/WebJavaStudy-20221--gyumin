package j09_클래스;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.schoolName = "한양대";
        student.studentCode = 1234;
        student.studentYear = 1;
        student.name = "김규민";
//        System.out.println("<<<<<<<<<<<학년증가>>>>>>>>>>>");
//        for (int i = 0; i < 10; i++) {
//            student.increaseStudentYear();
//            student.showStudentinfo();
//        }
        student.increaseStudentYear(2);
        student.increaseStudentYear(2);


    }
}
