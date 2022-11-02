package j15_Object클래스;

public class StringEquals {
    public static void main(String[] args) {
        int i = 10;

        String name1 = "김준일";
        String name2 = "김준일";
        String name3 = new String("김준일");
        String name4 = new String("김준일");

        System.out.println(name1 + ", " + name2+", "+name3);
//object로 변수를 선언하면 이미 업캐스팅 된상태이기 떄문에 여러 자료형을 답을수있다다운캐스팅 해서 사용해야한다
        System.out.println(name1 == name2);
        System.out.println(name1 == name3);//객체의 ==비교는 주소비교이다
        System.out.println(name3 == name4);
        System.out.println(name1.equals(name3));//이퀄스는 주소가아닌 안쪽의 값을 비교해준다
    }
}
