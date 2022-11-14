package j23_예외;

import java.util.Map;

public class CustomExcption extends  RuntimeException {

    private Map<String, String> errorMap;

    public Map<String, String> getErrorMap() {
        return errorMap;
    }

    public CustomExcption(String message, Map<String, String> errorMap) {
        super(message);
        this.errorMap = errorMap;
    }
}
