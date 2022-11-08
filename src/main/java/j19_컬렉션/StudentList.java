package j19_컬렉션;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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

        /*
        * id = 20220003학생을 찾아서 그학생의 이름이 김규민이면 김경민으로 봐꿔라*/
        searchId = 20220003;
        for (int i = 0; i < students.size(); i++) {
           if(students.get(i).getId() == searchId && students.get(i).getName().equals("김규민")) {
                students.get(i).setName("김경민");
                break;
            }
        }
        // 위아래 같은 도악을 하지만 다르게 짬
        for (Student student : students) {
            if(student.getId() == searchId && student.getName().equals("김규민")){
                student.setName("김경민");
                break;
            }
        }
        System.out.println(students);
        System.out.println("--------------------------------------------------------");

        for(Student student : students) {
            System.out.println(student);
        }
        System.out.println();
        searchId = 20220004;

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {//hasNext의 의미는 다음이 있니?이다 있으면 트루

            Student student = iterator.next();
            if(student.getId()==searchId){
                student.setName("박창우");
                break;
            }
        }
        System.out.println(students);

        List<Student> reverseStudent = new ArrayList<Student>();
      //  reverseStudent.addAll(students);
//        for (int i = 0; i < students.size();i++){
//            reverseStudent.add(students.get(students.size()-1-i));
//        }
        for(Student student : students){
            reverseStudent.add(0,student);
        }
        Collections.reverse(reverseStudent);
        System.out.println(reverseStudent);

        /*
        * idlist
        * namelist
        * */
        List<Integer> idlist = new ArrayList<>();
        List<String> namelist = new ArrayList<>();
        for(Student student : students){
            idlist.add(student.getId());
            }
        System.out.println(idlist);
        for(Student student : students){
            namelist.add(student.getName());
        }
        System.out.println(namelist);
        System.out.println(idlist);
        students.clear();
        Student student3 ;
        for(int i = 0; i < namelist.size(); i++) {
            students.add(new Student(idlist.get(i), namelist.get(i)));
        }
        System.out.println(students);
//        for(Student student : students){
//            namelist.get(student.getName());
//        }




    }

}
