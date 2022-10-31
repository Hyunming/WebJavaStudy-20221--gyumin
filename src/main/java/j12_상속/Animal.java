package j12_상속;

public class Animal {
    public String name;
    public Animal(String name) {
        System.out.println("animal 생성");
        this.name = name;
    }
    public void move(){
        System.out.println("움직입니다");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
