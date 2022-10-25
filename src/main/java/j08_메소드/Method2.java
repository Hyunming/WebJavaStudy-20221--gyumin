package j08_메소드;

import java.util.Scanner;

public class Method2 {
    /*
    * 별찍기
    * 1.*/
    public static String getStar(int x,int y) {
        String result = "";
        if(y == 1) {
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < i+1; j++) {
                    result += "*";
                }
                result += "\n";
            }
        }else if (y == 2) {
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x-i; j++) {
                    result += "*";
                }
                result += "\n";
            }

        } else if (y == 3) {
            System.out.println("메뉴3을 선택하셨습니다");
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x-i; j++) {
                    result += " ";
                }
                for (int j = 0; j < i+1; j++) {
                    result += "*";
                }
                result += "\n";
            }

        } else if (y == 4) {
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < i+1; j++) {
                    result += " ";
                }
                for (int j = 0; j < x-i; j++) {
                    result += "*";
                }
                result += "\n";
                System.out.println();
            }

        } else {
            System.out.println("입력오류!!");
        }
        return result;
        /*switch (y) {
            case 1:
                System.out.println("메뉴1을 선택하셨습니다");
                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < i+1; j++) {
                        System.out.print('*');
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("메뉴2을 선택하셨습니다");
                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < x-i; j++) {
                        System.out.print('*');
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("메뉴3을 선택하셨습니다");
                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < x-i; j++) {
                        System.out.print(' ');
                    }
                    for (int j = 0; j < i+1; j++) {
                        System.out.print('*');
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("메뉴4을 선택하셨습니다");
                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < i+1; j++) {
                        System.out.print(' ');
                    }
                    for (int j = 0; j < x-i; j++) {
                        System.out.print('*');
                    }

                    System.out.println();

                }
                break;


        }*/

    }
    public static void main(String[] args) {
        //입력
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int select = 0;
        System.out.print("별의 갯수입력:");
        n = scanner.nextInt();
        System.out.println("1.왼쪽에 치우친 증가하는별");
        System.out.println("2.오른쪽에 치우친 증가하는별");
        System.out.println("3.왼쪽에 치우친 감소하는별");
        System.out.println("4.오른쪽에 치우친 감소하는별");
        System.out.print("메뉴 선택:");
        select = scanner.nextInt();
        System.out.println(getStar(n,select));

    }
}
