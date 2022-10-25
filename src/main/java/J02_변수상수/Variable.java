package J02_변수상수;
//변수
public class Variable {
    public static void main(String[] args) {
        //논리 자료형 변수
        boolean checkFlag = false;
        System.out.println(checkFlag);
        checkFlag = true;
        System.out.println(checkFlag);
        //문자 자료형
        char name1 = '김';
        char name2 = '규';
        char name3 = '민';
        System.out.println(""+name1+name2+name3);
        System.out.println('가'+0);

        //문자열 자료형 변수
        String name = "김규민";
        String name4 = "윤도영";
        String name5 = name1+name4;
        System.out.println(name5);

        //정수 자료형 변수
        int width = 100;
        int width2 = 200;
        String width3 = "300";
        String width4 = "400";
        int widhtResult = width2 + width;
        String widthResult2 = width3+width4;
        System.out.println(widhtResult);
        System.out.println(widthResult2);

        long time = System.currentTimeMillis();
        System.out.println(time);
        long time2 = 1666178885589l;
        System.out.println(time2);

        //실수자료형 변수
        double pi = 3000000.141592653599999999;
        System.out.println(pi);

        final String FILE_PATH = "C:/Users/Junil";
//        FILE_PATH = "D:/Users/Junil";
        System.out.println(FILE_PATH);




    }
}
