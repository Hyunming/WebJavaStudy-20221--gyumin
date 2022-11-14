package j24_forEach;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class CollectionForEach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("김준일");
        list.add("김경민");
        list.add("김완준");
        list.add("이동빈");
        list.add("이종준");

        for (String name : list) {
            System.out.println(name);
        }
        //================================================================
        list.forEach(name -> {
            System.out.println(name);
        });

        //^^^^밑에껄 하나로 적은것
        Consumer<String> c =new Consumer<String>() {//<-이건 람다 풀은거
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        };
        Consumer<String> consumer = name/*매계뱐수는 하나일떄는 괄호 생략가능*/ -> /*->이게new Consumer<String>() {   //<-이건 람다
            @Override
            public void accept 랑같은 의미다*/ {
            System.out.println(name);
        };

        for(String name : Objects.requireNonNull(list)){
            consumer.accept(name);
        }
        list.forEach(name -> {
            System.out.println(name);
        });



        Set<Integer> numbers = new HashSet<Integer>();
        for(int i = 0; i < 100; i++) {
            numbers.add(i+1);
        }
        AtomicInteger result = new AtomicInteger();
        numbers.forEach(num ->{
            result.addAndGet(num);//가지고와서 더하라는 의미 +=랑동일
        });

        System.out.println(result.get());

        Map<Integer,String> students = new TreeMap<Integer,String>();//TreeMap이라는 걸쓰면 바로ㅠ 정렬이 됨 쓸수있는 경우가있음
        for(int i =0;i<10;i++) {

            students.put(20220001+i,"김준"+(i=1));
        }
        students.forEach((key,value)-> {
            System.out.println("학번:" +key+",이름: "+value);
        });
    }
}
