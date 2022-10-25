package j07_반복;

public class Loop6 {
    public static void main(String[] args) {
        int n = 5;
        for (int  i = 0; i < n; i++) {
            System.out.println(i+1);
        }

        int i = 0;

        while (i < n) {//반복탈출 조건
            System.out.println(i+1);
            i++;
        }
    }
}
