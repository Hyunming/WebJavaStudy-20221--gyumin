package j07_반복;

public class Loop1 {
    public static void main(String[] args) {
        int result = 0;
        /**
         * 반복을 해라 i가 1부터 100이 되기 전까지1씩증가시키면서
         */
        for(int i = 0; i<100;i++ ) {
            result += i +1 ;
            

        }
        System.out.println("1~100까지 더한 값:"+result);
    }
}
