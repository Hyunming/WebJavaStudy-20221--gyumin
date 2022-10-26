package j09_클래스;
/*Properties(속성)-(맴버)변수
* schoolName
* studentCode
* name
* studentYear
* name
*
* function(기능)-(맴버)메소드
* increaseStudentYear()-호출시에 연재 학년 1학년 증가 (최대 5학년)
showStudentinfo()-학생 정보 출력*/

public class Student {
    Student(){};
    String schoolName;
    int studentCode;
    int studentYear;
    String name;

    void increaseStudentYear() {
        if(studentYear < 5) {
        studentYear++;
        }else {
            System.out.println("최대학년 입니다");
            return;//void에서 return은 아무것도 반환하지 않는다 break라고 생각해
        }
        showStudentinfo();
    }
    void showStudentinfo() {
        System.out.println(schoolName+studentCode+"번"+ studentYear+"학년"+ name);
    }
    void increaseStudentYear(int year) {
        if(studentYear < 5) {
            studentYear+= year;
        }else {
            System.out.println(year+"을 더하면 최대학년을 넘어섭니다");
            return;//void에서 return은 아무것도 반환하지 않는다 break라고 생각해
        }
        showStudentinfo();
    }

}
