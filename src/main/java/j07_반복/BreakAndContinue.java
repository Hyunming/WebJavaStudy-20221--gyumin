package j07_반복;

public class BreakAndContinue {
    public static void main(String[] args) {
        int i = 0;

        while(true) {
            if(i>9) {
                break;
            }
            System.out.println(i);
            i++;
        }
        for (int j = 0; j < 10; j++) {
            if(j==7) {
                System.out.println("7을 만남");
                break;
            }
            System.out.println(j);
        }
        System.out.println("<<<<<<<<<<Continew>>>>>>>>>>>>>>");
        for (int j = 0; j < 100; j++) {

            if(j % 5 != 0 || j==0) {
                continue;//이게 작동되면 이거 밑에 있는 코드들이 다무시되고 다음 반복으로 넘어간다
            }
            System.out.println(j);
        }

    }
}
