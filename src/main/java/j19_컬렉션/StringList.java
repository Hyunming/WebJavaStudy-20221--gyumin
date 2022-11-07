package j19_컬렉션;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StringList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        //값추가
        list.add("문자열1");
        list.add("문자열2");
        list.add("문자열3");
        list.add("문자열4");

        printCollection(list);

        list.add(1,"문자열5");
        printCollection(list);

        ArrayList<String> addAllList = new ArrayList<String>();
        addAllList.addAll(list);
        addAllList.addAll(2,list);
        printCollection(addAllList);//collection을 상속받아서 가능하다업캐스팅?
        //값조회
        String str1 = list.get(0);
        System.out.println("str1 : "+str1);
        //반복을 사용한 값조회
        for (int i = 0; i < list.size(); i++){//밑에랑 똑같은 역할을 하는 나에게 친숙한 반복문^^
            System.out.println("일반 for - str"+list.get(i));
        }
        for(String str : list){//처음부터 끝가지 전부다 꺼넬떄가지 반복한다 리스트의 긑에 도달할떄까지
            System.out.println("forEach _ str: "+str);
        }
        Iterator<String> iterator = list.iterator();
        System.out.println("iterator 첫 생성시: " + iterator.next());

        while (iterator.hasNext()) {//hasNext의 의미는 다음이 있니?이다 있으면 트루
            System.out.println("iterator - str: "+iterator.next());//iterator.next();의 의미는 다음녀석 나와 같은 느낌이다 걍 출력이라고 생각해라 그니깐 위에서 다음이있느니 확인하고있으면 밑에서 출력하고의 반복이다
            //출력이라기보단 내쫒는거다 한번쓰면 사라진다 그니깐 나번 나오게 하면 텅 비게 되는것이다 나오게했으니까 빈집이지
        }
        //System.out.println(iterator.next());//다음이 없으므로 오류가 난다 빈집이니깐 그러니 hasNext와 함깨 쓰는 것이 좋다 다음이 있는 지 확인해야하니깐

        //값 수정
        list.set(1,"문자열 6");//문자열 을 수정하는 것이다
        printCollection(list);

        //값 삭제
        list.remove(0);
        printCollection(list);//보통은 오프젝트 보단 인덱스로 값을 삭제한다 list는 중복을 허용하기떄문이다
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("문자열3")) {
                list.remove(i);
                break;//지우면 새로운 크기의 배열을 만들어서 옮겨주기떄문에 밀려서 오류가 난다. 그러기에 꼭 브레이크를 넣어 주어야한다
            }
        }
        //값의 위치 찾기
        list.add("문자열2");
        printCollection(list);
        int index = list.indexOf("문자열2");
        System.out.println("문자열2의 위치 :"+ index);//앞에서 부터 찾기

        int lastIndex = list.lastIndexOf("문자열2");
        System.out.println("뒤에서 부터 찾은 문자열 위치"+lastIndex);//뒤에서 부터 칮기
        //값을 포함하고 있는지 여부초회
        boolean  isTrue = list.contains("문자열2");
        System.out.println("list에 묹바열 5가 포한 되어 있는가"+ isTrue);

        //리스트를 배열로 변환
        Object[] objects = list.toArray();//리스트에 어떤 값이 있을지 모르기 떄문에 objects를 사용해 준다
        System.out.println(objects[0]);
        System.out.println();
        for (Object object : objects) {
            System.out.println(object);
        }
//        list.add("김");
//        list.add("준");
//        list.add("일");//리스트는 자동으로 공간이 늘어났다 줄어 들었다한다

    }
    public static void printCollection(Collection collection){
        System.out.println(collection);//출력을 위한 메소드  다들 Collection을 상속받지
        System.out.println();
    }
}
