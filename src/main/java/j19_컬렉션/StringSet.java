package j19_컬렉션;

import java.util.*;

public class StringSet {
    public static void main(String[] args){
        //set에는 순서가 없다그러므로 원하는 위치에 값을 못넣는다
        //set은 중복갓을 제가하는 용도로도쓰인다
        Set<String> strSet = new HashSet<String>();
        List<String> strList = new ArrayList<String>();
        strList.add("이동빈");
        strList.add("이승아");
        strList.add("우예희");
        strList.add("이종준");
        strList.add("변상원");
        strList.add("김준일");//중복안되서 한번만나옴
        //값추가
        strSet.add("김준일");
        strSet.add("장혜미");
        strSet.add("정순동");
        strSet.add("김완준");
        strSet.add("송아셀");
        System.out.println(strSet);
        strSet.addAll(strList);
        System.out.println(strSet);
        //값조회
        String searchName = "김준일";
        /*
        * strSet에 김준일이 있으면 true없으면 false*/
        boolean isTrue = false;
        for(String name : strSet){//처음부터 끝가지 전부다 꺼넬떄가지 반복한다 리스트의 긑에 도달할떄까지
            if(searchName.equals(name)){
                isTrue = true;
                break;
            }

        }
        System.out.println(isTrue);

        //수정
        /*
        * 송아셀 -> 남강석*/
        searchName = "송아셀";
        for(String str : strSet){//처음부터 끝가지 전부다 꺼넬떄가지 반복한다 리스트의 긑에 도달할떄까지
            if(searchName.equals(str)) {
                strSet.remove(str);
                strSet.add("남강석");
                break;
            }
        }
        System.out.println(strSet);
        searchName = "김준일";
        System.out.println(strSet.contains(searchName));
        if(strSet.contains(searchName)){
            strSet.remove(searchName);
            strSet.add("김준이");
        }

        System.out.println(strSet);



    }
}
