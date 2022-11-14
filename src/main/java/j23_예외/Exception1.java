package j23_예외;

public class Exception1 {
    public static void main(String[] args) {
        int[] namebers = new int[]{1,2,3,4,5,6,7};

        try {
            String a = null;
            a.toLowerCase();

            for (int i = 0; i < 8; i++) {
                System.out.println(namebers[i]);
            }

        }catch (ArrayIndexOutOfBoundsException/*<--자기한테 맞는 예외를 지정해주어야한다*/ e) { //e<-는 예외메시지 어떤예외인지
            System.out.println("예외를 처리하였습니다"+e);
        }catch (NullPointerException e){
            System.out.println("nll pointer to exception");//<--예외를 여러번 잡아줄수있다 .실행구조가 if랑 비슷함 1번 catch에서 안되면  2번 catch로가고 매우 흡사하다
        }finally {
            System.out.println("항상 실행되어야 하는 서비스");//<--뭐가 되었던 일딴 항상 실행됨
        }

        System.out.println("프로그램 정상 종료");

    }
}
