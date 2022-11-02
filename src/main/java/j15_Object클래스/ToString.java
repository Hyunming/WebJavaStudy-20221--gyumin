package j15_Object클래스;

public class ToString {
    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest();

        System.out.println(objectTest);
        System.out.println(objectTest.toString());

        String str = objectTest.toString();
        System.out.println(str);//Strinf에 넣을 려면 .toString을 써서 형변환을 해야한다
        System.out.println(objectTest.showInfo());

        Teacher teacher1 = new Teacher("김준일","코리아아이티");
        Teacher teacher2 = new Teacher("김준이","부사뇨육대학원");
        System.out.println(teacher1);
        System.out.println(teacher2);
    }
}
