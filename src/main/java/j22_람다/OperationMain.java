package j22_람다;

public class OperationMain {
    public static void main(String[] args) {
        int a =10 , b=20;
        Operation add = new Operation() {
            @Override
            public int calc(int x,int y) {// 자료형 생략가능
                return  x+y;//리턴 생략가능         ^^^생략할거면 이거랑 같이 할것
            }
        };
        Operation add2 = (x,y) -> x+y;//인터페이스를 이런식으로 구현하는것 인터페이스에 정의된부분을 가져와사용
        Operation add3 = (int x,int y) -> {return x+y;};//위랑같은데 인터페이스에서 int 가 정의되어있기에 생략가능//메소드는 꼭하나만 있어야함 2개있으면 오류남 단 디폴트 메소드는 존제해도됨
        Operation sub = (int x , int y) -> {
            return x-y;
        };
        System.out.println(sub.resultToString(sub.calc(b,a)));

        int addResult = add.calc(a,b);
        System.out.println(a + "+" + b + " = " + addResult);

        int addResult2 = add2.calc(a,b);
        System.out.println(a + "+" + b + " = " + addResult2);

        Operation multi = ( x ,  y) ->  x*y;
        System.out.println(multi.calc(20,10));
        Operation div = (x , y) -> x/y;
        System.out.println(div.calc(20,10));


    }
}
