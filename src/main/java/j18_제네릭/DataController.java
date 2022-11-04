package j18_제네릭;


import java.util.Date;

public class DataController {//자료형을 상황에 따라 변화를 줄수있는것
    public static void main(String[] args){
        Date now = new Date();
        ResponseData<String> responseData = new ResponseData<String>("날짜 저장 성공!",now.toString());
        System.out.println(responseData);

        ResponseData<Integer> responseData2 = new ResponseData<Integer>("번호저징성공!",10);
        System.out.println(responseData2);

        ResponseData<Date> responseData3 = new ResponseData<Date>("날짜 객체 저장 성공",now);
        System.out.println(responseData3);
    }
}
