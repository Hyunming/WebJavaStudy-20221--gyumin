package j14_참조자료형캐스팅.동물;

public class AnimalMain {
    public static void main(String[] args) {
        Human human = new Human();
        Tiger tiger = new Tiger();
        Animal animal1 = null;
        Animal animal2 = null;

        System.out.println("[캐스팅 전]");
        human.move();
        human.readBooks();
        tiger.move();
        tiger.hunting();

        System.out.println("[캐스팅]");

        System.out.println("<업캐스팅>");
        animal1= human;
        animal2 = tiger;
        animal1.move();
        animal2.move();

        System.out.println("<다운캐스팅>");
        Human d_human =(Human) animal1;
        Tiger d_tiger =(Tiger) animal2;
        d_tiger.hunting();
        d_human.readBooks();

        System.out.println("================================");
        System.out.println();

        Animal a = new Animal();
        Human h = (Human) a;//메모리 구조오류 다운캐스팅은 업캐스팅 된적이 있어야 가능하다 메모리가 할당이 되어있어야하기떄문이다 일반 자료형이랑 은 쪼다른 참조 자료형 캐스팅의 특징 중하나
        h.readBooks();
    }
}
