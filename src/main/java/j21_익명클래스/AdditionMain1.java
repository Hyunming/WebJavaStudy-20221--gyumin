package j21_익명클래스;

public class AdditionMain1 {
    public static void main(String[] args) {
        Addition<String> stringAddition = new AdditionImpl<String>();
       String str =  stringAddition.add("문자열");
        System.out.println(str);

        Addition<Integer> integerAddition = new AdditionImpl<Integer>() {//클래스인데 1회용트리 호출하고 바로 정의 해서 쓴다 이거 빙금 이해한거 이렇게 하면 클래스 이름도 없어서 익명클래스라하고 이름이 없기에 단한번만 쓸숭ㅆ다
            public Integer add(Integer values) {
                return null;
            }
        };
    }
}
