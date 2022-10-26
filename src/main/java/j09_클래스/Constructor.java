package j09_클래스;

public class Constructor {
    int num;//전역변수
    String name;

    Constructor() {
        System.out.println("NoArgsConstructor(기본생성자)");
    }

    Constructor(int num /*지역변수*/) {
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로하는 생성자)");
        this.num = num;
    }
    Constructor(String name) {
        System.out.println("RequiredArgsConstructor(String 매개변수를 필수로하는 생성자)");
        this.name = name;
    }
    Constructor(int num,String name) {
        System.out.println("AllArgsConstructor(전채생성자)");
        this.num = num;//알고있지만 다시 적자면 this로 같은 이름의
        this.name = name;
    }
    void showinfo() {
        System.out.println("num: " + num);
        System.out.println("name: " + name);
    }
}
