package j22_람다;

import j17_스태틱.PathRepository;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args){
        //Runnable
        Runnable runnable = () -> {
            System.out.println("첫번쨰 프로그램을 실행합니다 ");
        };
        Runnable runnable2 = () ->{
            System.out.println("두번쪠 프로그램을 실행합니다");
        };
        runnable.run();
        runnable2.run();

        Thread thread1 = new Thread(()-> {// 쓰래드는 2개가 같이돈다 동시에 돌고있는거다 순서에 상관없이
            for(int i = 0; i <100; i++){
                try {
                    Thread.sleep(100);
                    System.out.println("쓰레드1: "+i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);//alt+enter
                }
            }
        });
        Thread thread2 = new Thread(()-> {
            for(int i = 0; i <100; i++){
                try {
                    Thread.sleep(100);
                    System.out.println("쓰레드2: "+i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);//alt+enter
                }
            }
        });
//        thread1.start();
//        thread2.start();

        Supplier<String> supplier = () -> "공급";//서플라이어 안에 구현되어있는거 자바에서 자체적 지원
        System.out.println(supplier.get());

        Consumer<String> consumer = name-> {//매개 변수가 하나일떄만 생략가능
            System.out.println("이름: "+name);
        };
        consumer.accept("김준일");

        Function<Integer,String> function = age -> "나이: " + age;
        System.out.println(function.apply(29));
// 인터넷에 잘설명되어있으니 검색 조져
        Predicate<Integer> leapMonth = year -> year % 4 == 0 && year % 100 != 0 || year % 400 ==0;
        System.out.println(leapMonth.test(2000));
    }
}
