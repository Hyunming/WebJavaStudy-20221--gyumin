package j06_조건;

import java.util.Scanner;

public class Conditon2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int VIP_POINT = 80;
        final int GOLD_POINT = 60;
        final int SILVER_POINT = 40;
        final int BRONZE_POINT = 20;
        int point = 0;
        String rating = null;
        System.out.print("회온 포인트 점수를 입력하세요:");
        point = scanner.nextInt();
        if (point > VIP_POINT) {
            rating = "VIP";
        }else if (point < GOLD_POINT) {
            rating = "GOLD";
        } else if (point > SILVER_POINT) {
            rating = "SILVER";
        } else if (point < BRONZE_POINT) {
            rating = "BRONZE";
        }else {
            rating = "GENERAL";
        }
        System.out.println("회원의 등급:"+rating);

        if (point < BRONZE_POINT) System.out.println("test");
        else System.out.println("test2");//이런 모양도 되는지 첨알음;;근데 이걸 구질쓸필요가;; 이거 명령한줄만 가능함 중괄호없을떄한마디로 명령이하나면 중괄호 생략가능

        if (point > VIP_POINT) {
            rating = "VIP";
        }else{
            if (point < GOLD_POINT) {
                rating = "GOLD";
            } else{
                if (point > SILVER_POINT) {
                    rating = "SILVER";
                } else{
                    if (point < BRONZE_POINT) {
                        rating = "BRONZE";
                    }else {
                        rating = "GENERAL";
                    }
                }
            }
        }


    }
}
