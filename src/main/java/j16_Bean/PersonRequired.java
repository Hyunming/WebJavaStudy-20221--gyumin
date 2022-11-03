package j16_Bean;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor//final 상수만 초기화하는 초기화하는 생성자를 만든것이다
@AllArgsConstructor//모든 변수를 초기화하는 생성자
public class PersonRequired {
    private final String name;  //맴버변수 final을 선언하면 필수값이 된다
    private int age;

}
