package j05_Scanner;

import java.util.Scanner;
/*
* 이름: 김준일  name
* 나이: 29     age
* 주소: 부산 동래구 사직동 address
* 전화버호: 010 9988 1916 phone
* 사용자의 이름은 김준일이고 나이는 29입니다.
* 주소는 부산 동래구 사직동이며 연락처는 010 9988 1916입니다*/

public class input3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름:");
        String name = scanner.nextLine();
        System.out.print("나이:");
        int age = scanner.nextInt();
        System.out.print("주소:");
        scanner.nextLine();
        String address = scanner.nextLine();//이거 쫌더 검색해봐 버퍼 어쩌고저쩌고하면서 위에서 넥스트 라인으로 받아서 엔터가 자동으로 처져서 윙[처러 ㅁ엔터를 날려줘야한다는데 난모르것다
        System.out.print("전화번호:");
        String phone = scanner.nextLine();
        System.out.println("사용자의 이름은 "+name+"나이는"+age+"입니다.\n주소는  "+address+"이며 연락처는 "+phone+"입니다.");
//뭐 영상 같은데 보면 요즘 유튜브 같은 스트리밍 서비스가있지않는가 근데 그 영상을 전부다 다운로드 하고 볼려면 영상보기 전마다 기다려야하니 버퍼라는 것을쓴다 한마디로 영상을 쪼게서 조금식다운로드 받는 것이다

    }
}
