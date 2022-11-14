package j23_예외;

public class Exception2 {
    public static void printArray(int[] numbers) throws Exception /*나를 호출한 지점으로  미루는것 예외처리를하도록 강제성을 준다*/{
        for (int i = 0; i < numbers.length+1; i++){
            System.out.println("/"+numbers[i]);
        }
    }
    public static void main(String[] args) {
        if(1==1) {//이런 오류를 잡아주는 과정에서 로그를 이용해 오류를 수집하여 캐치할수있다 업데이트
            try {
                throw  new  RuntimeException("예외강제 실행");
            } catch ( ArrayIndexOutOfBoundsException e) {//<--예외처리 실패
                System.out.println("런타임예외처리");
            }catch (Exception e) {//모든 예외를 처리할수있따 chacked 도 가능 안전빵으로 넣는 느낌 꺼지면 안되니깐
                e.printStackTrace();
            }finally {//<-- 그래도 실행됨 예외처리를 실패해서 강제로 종료되더라도 실행된다 야기에 임시저장같은 거 만들어 넣는거
                System.out.println("예외가 발생하던 안하던 실행");
            }
        }
        System.out.println("프로그럄 정상종료");

//        try {
//            printArray(new int[] {1,2,3,4,5});
//
//        }catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("예외처리함");
//            e.printStackTrace();//<--정상종료는 하되 어떤 예외인지 알려주는것
//        }catch (Exception e) {
//            throw  new RuntimeException(e);// dPdhlfmf rkdwpwjrdmfh todtjd
//        }



    }
}
