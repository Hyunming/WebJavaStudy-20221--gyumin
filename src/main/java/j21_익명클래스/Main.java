//package j21_익명클래스;
//
//public class Main {
//    public static void main(String[] args) {
//        Interface1 interface1 = new Class1();
//        Interface1 interface2 = new Class1();
//        Interface1 interface3 = new Class1();
//        Interface1 interface4 = new Class1();
//        Interface1 interface5 = new Class1();
//        interface1.methodName();
//        interface2.methodName();
//        interface3.methodName();
//        interface4.methodName();
//        interface5.methodName();
//
//        Interface1 interface6 = new Interface1() {//이제 위에꺼랑은 다르게 여기서 정의와 생성을 같이해주고 오버라이드도 즉석으로 해준다 그렇기에 한번만 사용이 가능하다 재사용성이 거의없다 하번쓰고 버릴거
//            @Override
//            public void methodName() {
//                System.out.println("익별클래스");
//            }
//
////            public void methodName2() {
////                System.out.println("sas");
////            }
//        };
//        interface6.methodName();
//        //interface6.();
//
//
//    }
//}
