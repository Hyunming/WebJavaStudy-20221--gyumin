package j07_반복;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int n = 0;

        System.out.println("몇번출력할지 입력");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(i+1);
        }
        for (int i = 0; i < n; i++) {//역순
            System.out.println(n-i);
        }
    }
}
