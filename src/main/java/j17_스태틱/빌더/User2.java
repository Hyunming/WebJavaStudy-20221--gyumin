package j17_스태틱.빌더;

import lombok.Builder;//이떄까지 생 고생한게 이거 하나로 완성됨 ㄷㄷ 이거 넘편한거 아니냐
import lombok.ToString;

@ToString
@Builder
public class User2 {
    private String username;
    private String password;
    private String email;
    private String name;//변환100번 주소에ㅜ있는건 user객체를 생성할떄 전달해줘서 생성해서 객체안의 값들이 그래오 옮겾;ㅁ

    public User to() {
        return User.builder()
                .username(username)
                .password(password)
                .email(email)
                .name(name)
                .build();
    }
}
