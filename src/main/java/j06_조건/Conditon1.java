package j06_조건;

public class Conditon1 {
    public static void main(String[] args) {
        int num = 10;
        if(num >0 || num == 0) {
            System.out.println("num은 0이거나 양수입니다");
        }else{
            System.out.println("num은 음수입니다");
        }

        if(num < 0) {
            System.out.println("num은 음수입니다");
        }

    }
}
