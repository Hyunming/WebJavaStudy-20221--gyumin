package j16_Bean;

public class Person {
    private final String name;  //맴버변수 final을 선언하면 필수값이 된다
    private int age;
    //public Person() {} <- NoArgsConstructor는RequiredArgsConstructor와 함꺠쓸수없다      //final이 있으므로 생성 불가능한 생성다

    public Person(String name) {  //<-RequiredArgsConstructor
        this.name = name;

    }

    public Person(String name, int age) { //<--AllArgsConstructor
        this.name = name;
        this.age = age;
    }
}
