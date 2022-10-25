package j04_연산자;

public class Operation3 {
    public static void main(String[] args) {
        /*윤년은 연도가 4의 배수이면서 100의 배수가 아닐떄 또는 400의 배수일떄다*/
        int year = 2400;
        boolean result = false;

        result = year % 4 ==0 && year % 100 != 0 || year % 400 == 0;
        System.out.println(result);
    }
}
