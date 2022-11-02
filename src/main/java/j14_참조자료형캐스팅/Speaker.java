package j14_참조자료형캐스팅;

public class Speaker implements Power {
    @Override
    public void on() {
        System.out.println("스피커on");
    }

    @Override
    public void off() {
        System.out.println("스피커off");
    }
}
