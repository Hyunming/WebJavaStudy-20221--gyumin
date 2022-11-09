package j19_컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentSet {
    public static void main(String[] args) {
        int o = 0;

        while (o <= 5) {

            o++;
            System.out.println(o);
        }
        Set<Student> students = new HashSet<Student>();
        students.add(new Student(20220001, "김준일"));
        students.add(new Student(20220002, "정빈"));
        students.add(new Student(20220003, "김규민"));
        students.add(new Student(20220004, "박경호"));
        students.add(new Student(20220005, "김혜진"));
        students.add(new Student(20220006, "김지향"));
        /*
        * 1.김혜진 학생의 학번을 출력하세요
        * 2.20220004 학번을 가진 학생의 이름을 설민수로 변경하세요
        * 3.20220001 학번이 존재하면 해당학생을 삭제하세요
        * set -> list 변환
        * 해당 list를 학번 순서에 맞게 정렬하시오
        */
        for(Student str : students){//처음부터 끝가지 전부다 꺼넬떄가지 반복한다 리스트의 긑에 도달할떄까지
            if(str.getName().equals("김혜진")){
                System.out.println(str.getId());
                break;
            }
        }
        for(Student str : students){//처음부터 끝가지 전부다 꺼넬떄가지 반복한다 리스트의 긑에 도달할떄까지
            if(str.getId()== 20220004){
                str.setName("설민수");
            }
        }
        for(Student str : students){//처음부터 끝가지 전부다 꺼넬떄가지 반복한다 리스트의 긑에 도달할떄까지
            if(str.getId() == 20220001) {
                students.remove(str);
                break;
            }
        }
        int i =20220000;
        int j =0;
        List<Student> studentList = new ArrayList<Student>();
        while(j <= students.size()){
            j++;
            for(Student str : students) {
                if (str.getId() == i) {
                    studentList.add(str);
                }

            }
            i++;
        }
        System.out.println(studentList);
        System.out.println(students);
        System.out.println(students.size());

    }
}
