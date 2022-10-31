package j13_추상화.추상클래스;
//class 앞에도 abstract가붙는 다  추상메소드가 하나라도있으면 해당클래스는 추상클래스로 정의되어야 한다
//2.추상 클래스는 생성할수없다
//3. 그외의 다른 특징은 일반 클래스와 동일 하다
//4.추상클래스는 무조건 상속받아서 서야한다
//무조건 1:n관계이다
//상속은 1개만 가능
public abstract class Factory {
    private String name;

    public Factory(String name) {
        this.name = name;
    }
    /**
     * abstract 추상적인*/
    public abstract void produce(String model);//구현이 필요가 없기에 바로;찍고 끝넴
    public abstract void managemant();
    public String getName() {
        return name;
    }
    public void printinfo() {//추상클래스에서도 일반 메소드 정의 가능
        System.out.println("공장 정보를 출력 합니다");
        System.out.println("공장이름"+name);
    }

}
