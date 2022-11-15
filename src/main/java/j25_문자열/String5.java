package j25_문자열;

public class String5 {
    public static void main(String[] args) {
        String httpMethod = "Get";
//tolowerCase 소문자화
        //toupperCase 대문자화
        if(httpMethod.equalsIgnoreCase/*대소문자를 상관하지 않고 비교한다*/("gET")) {
            System.out.println("get요청입니다");
        }else {
            System.out.println("get요청이아닙니다");
        }
    }
}
