package j15_Object클래스;

import j15_Object클래스.Teacher;

public class TeacherEquals {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("김준일","코리아아이티");
        j15_Object클래스.equals.Teacher teacher2
                = new j15_Object클래스.equals.Teacher("김준일","코리아아이티");

      //  System.out.println(teacher1 == teacher2);//자료형이 다르므로 사용불가
        System.out.println(teacher1.equals(teacher2));// 자료형이 달라도 비교는 가능하다
        System.out.println(teacher1.hashCode()==teacher2.hashCode());//값이 같으면 true가나옴 값만 같으면 된다
    }




    @Override
    public String toString() {
        return super.toString();
    }
}
