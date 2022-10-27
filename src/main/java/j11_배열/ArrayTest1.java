package j11_배열;

public class ArrayTest1 {

    public static void main(String[] args) {
        int[] numArray = new int[10];//배열 int의 배열 형태
        //new는 메모리를 생서하는 거다 새로 메로리를 빌려오는거
        int index =0;

        numArray[index] = 10;

        for(int i = 0; i < 10; i++){//반복으로 배열에 넣을수있다
            System.out.println(numArray[i]);
        }
    }
}
