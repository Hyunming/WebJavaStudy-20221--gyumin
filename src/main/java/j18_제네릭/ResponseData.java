package j18_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseData<T> {//자료형에따라 변화한다
    private String message;
    private T data;
}
