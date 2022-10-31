package j12_상속;

public class Human extends Animal  {
//    public void move(){
//        System.out.println("두 발로 걷습니다");
//    }
//    public void runMove(){
//        //상속을 받아도 private은 상속이 되지 않는다
//        move();//두개의 클래스가 붙어있기에 생성하지않아도 호출가능
//    }
    public Human(String name) {
        super(name);//기본적으로 생략되어있다//부모먼저 생성돼야해
        //super.move();//부모의 객체에 접근 this같은거다
        System.out.println("Human 생성");
    }
    /*
    * 메소드 오버라이딩(오버라이드)
    * 재정의
    * 상위(Animal) 객체의 메소드를 하위(Human) 객체에서 다시정의하는 행위*/
    @Override //@(어노테이션) 해당 메소드가 상위 객체로부터 재정의된 메소드입니다를 표기기능 없음
    public void move() {
        super.move();
        //move(); //자기 자신을 호출 제귀함수 무한반복
        System.out.println("두 발로 걷습니다");
    }
}
