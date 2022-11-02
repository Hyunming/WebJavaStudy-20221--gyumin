package j13_추상화.인터페이스;

public abstract class Button implements Press,Down,Up {
//탬플릿 메소드 패턴
    //implements 다중상속이 가능하며 부모의 메소드를 반드시 오버라이딩(재정의)해야한다
    @Override
    public void onDown() {

    }

    @Override
    public void onUp() {

    }

    @Override
    public void onPressed() {

    }
}
