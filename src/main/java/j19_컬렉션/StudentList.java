package j19_컬렉션;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(20220001, "김준일"));
        students.add(new Student(20220002, "정빈"));
        students.add(new Student(20220003, "김규민"));
        students.add(new Student(20220004, "박경호"));
        students.add(new Student(20220005, "김혜진"));
        students.add(new Student(20220006, "김지향"));

        String serrchName = "김규민";
        int studentscode = 0;
        for (Student student : students) {
            if (student.getName().equals(serrchName)) {
                System.out.println(serrchName + "학생의 학번" + student.getId());
                break;
            }
        }
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(serrchName)) {
                System.out.println(serrchName + "학생의 학번: " + students.get(i).getId());
                break;
            }
        }


        int searchId = 20220002;
//        for (int i = 0; i < students.size(); i++) {
//            if(students.get(i).getId() == searchId) {
//                students.remove(i);
//                break;//지우면 새로운 크기의 배열을 만들어서 옮겨주기떄문에 밀려서 오류가 난다. 그러기에 꼭 브레이크를 넣어 주어야한다
//            }
//        }
        for(Student student : students) {
            if(student.getId() == searchId) {
                students.remove(students.indexOf(student));
                break;
            }
        }
        System.out.println(students);
    }

}
