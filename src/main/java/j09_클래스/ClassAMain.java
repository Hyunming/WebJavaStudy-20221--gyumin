package j09_클래스;

public class ClassAMain {
    public static void main(String[] args) {
        System.out.println(new ClassA());
        System.out.println(new ClassA());
        System.out.println(new ClassA());
        System.out.println(new ClassA());
        ClassA a1 = new ClassA();
        ClassA a2 = new ClassA();
        a1.name= "김규민";
        System.out.println(a1.name);
        a2.name = "김규헌";
        System.out.println(a2.name);
        a1.callName();
        a2.callName();//알아야할게 생성자를 가장 밑에적어도 가장 먼저 출력된다

    }
}
