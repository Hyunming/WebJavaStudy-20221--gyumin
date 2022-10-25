package j07_반복;

import java.util.Scanner;

public class Loop5 {
    public static void main(String[] args) {
        for(int j = 0; j < 9; j++) {//여기서 i는 지역 변수로 이 for문 안에서만 사용가능하다
            for (int i = 0; i < 9; i++) {
                int num = i + 1;
                System.out.println((j+1) + "x" + num + "=" + ((j+1) * num));
            }
        }
    }
}
