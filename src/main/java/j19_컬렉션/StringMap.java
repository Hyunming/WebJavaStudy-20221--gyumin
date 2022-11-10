package j19_컬렉션;

import java.security.KeyStore;
import java.util.*;

public class StringMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        List<String> list = new ArrayList<String>();
        list.add("김준일");
        list.add("이동빈");
        list.add("도정민");
        list.add("최해혁");
        list.add("김준일");

        System.out.println(list);
        System.out.println(list.get(3));
        map.put("kor2022000-j","김준일");//첫번쨰 메게변수가 키값이고 두번쨰가 정보다 항상 3개를 넣어야한다
        map.put("kor2022000-l", "이동빈");
        map.put("kor2022000-d", "도정민");
        map.put("kor2022000-c", "최해혁");
        map.put("kor2022000-j2", "김준일");//키값의 해쉬 데이터 순으로 정력 걍 무작위라는 소리다 set이랑 같다 키값은 거의다 ㅅ트링으로 사용한다
        System.out.println(map);
        System.out.println(map.get("kor20220003"));

        /*
        * kor 2022000_c 학번의 학생의 이름을 김완준으로 봐꾸시오
        */
        String searchid = "kor2022000-c";
        //put을 사용하여 값변경
        map.put(searchid,"김완준");//이렇게 수정가능 중복이 허용되지않아 이걸로 덥어써버림 키값은 고유하다
        System.out.println(map);
        //값 수정
        map.replace(searchid,"이성욱");//이게 list에서의 set메소드와 동일하다
        System.out.println(map);
        //값 삭제
        map.remove(searchid);
        System.out.println(map);

        boolean searchSuccessflag = map.containsKey(searchid);//특정 키값의 존재유무를 알려준다
        System.out.println(searchSuccessflag);
        searchSuccessflag = map.containsValue("김준이");//특정 value값의 존재유무를 알려준다
        System.out.println(searchSuccessflag);
        Set<Map.Entry<String , String>> entry = map.entrySet();
        List<Map.Entry<String,String>> entries = new ArrayList<Map.Entry<String,String>>();
        entries.addAll(entry);

        System.out.println("entry리스트: " + entries);
        Iterator<Map.Entry<String,String>> iterator = entry.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> e = iterator.next();
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keySet = map.keySet();
        System.out.println("keySet>>>>> "+keySet);

        Collection<String> values = map.values();

        System.out.println("values>>>>> "+values);

    }
}
