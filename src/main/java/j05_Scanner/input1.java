package j05_Scanner;

import java.util.Scanner;

public class input1 {
    public static void main(String[] args) {
        /**
         * 문자열 입력
         * next()       ->띄어쓰기 포함X
         * nextLine()   ->띄어쓰기포함O
         */



        Scanner scanner = new Scanner(System.in);
        String name = "김규민";

        String s = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();
        //띄어스기로 자르지 않고 입력받으려면nextLine입려

        System.out.println("입력 받은 값1 "+s);
        System.out.println("입력받은 값2  "+s2);
        System.out.println("입력받은 값3 "+s3);
    }
}
