package j16_Bean;

import lombok.*;
//lombok을 사용현 앞엣 했던 귀찮을 것들을 이렇게 쉽게 할수있다
// 정보를 담는 객체를 Entity Class라고 한다.
/*
* 맴버변수 선언
* 생성자 정의
* Gatters and Setters 정의
* Equals and HashCode 정의
//* toString 정의*/
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data//위에 주석이 있는 모든걸 포함한다
//lombok을 사용하면 변수를 봐꿔도 알아서 다처리해준다
public class UserEntityLombok {
    private String username;
    private String password;
    private String email;
    private String name;

}
