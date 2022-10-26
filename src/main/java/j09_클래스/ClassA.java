package j09_클래스;

public class ClassA {

    int num;
    String name;
    double score;

    //생성자 클래스명이랑 일치해야하며 반환 자료형이 없다 생성자는 항상 주소가 반환된다 반환 자료형 생략
    ClassA() {//생성자 기본적으로 다 있으며 생략되어있을뿐이다
        System.out.println("classA를 생성합니다.");
    }
    ClassA(int a) {//오버로딩 된 생성자가 하나라도 있으면 기본생성자는 다죽어버린다
        System.out.println("a:"+ a);
    }

    void callName() {
        System.out.println(name+"을(를)부릅니다");
    }
}
