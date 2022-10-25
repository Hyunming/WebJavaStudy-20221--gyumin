package j06_조건;

import java.util.Scanner;

public class Conditon6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        System.out.println("점수를 입력하세요:");
        score = scanner.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("계산불가");
        }else {

            switch (score /10) {//이거 int함수라서 소수점 다날리기떄문에 굿
                case 10:
                case 9:
                    System.out.println("A학점");
                    break;
                case 8:
                    System.out.println("B학점");
                    break;
                case 7:
                    System.out.println("C학점");
                    break;
                case 6:
                    System.out.println("D학점");
                    break;
                default://else와 같이 위 에 캐이스에 해당하는게 없을시 실행됨
                    System.out.println("F학점");

            }
        }


    }
}
