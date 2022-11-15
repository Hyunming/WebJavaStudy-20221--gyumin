package j25_문자열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String4 {
    public static void main(String[] args) {
        String roleString = "ROLE_USER,ROLE_MANAGER,ROLE_ADMIN,TESTER";//ROLE에서 앞에 붙는 녀석을 프릭피스 뒤에 붙는 놈을 서브 픽스 라고 한다
        String[] roleArray =  roleString.split(",");//,를 기준으로 나누어서 문자열 배열로 만들어라
        for(String role : roleArray) {
            System.out.println(role);
        }
        List<String> rolelist = Arrays.asList(roleArray);//바로 배열을 리스트로 변환하여 넣어준다
        List<String> validRoleList = new ArrayList<String>();
        List<String> validRoleList2 = new ArrayList<String>();
        rolelist.forEach(role -> {
            if(role.startsWith/*불리언을 리턴해준다 있다없다*/("ROLE")){
                validRoleList.add(role);
            }
        });
        System.out.println(validRoleList);

        rolelist.forEach(role -> {
            if(role.endsWith("MANAGER")|| role.endsWith("ADMIN")){
                validRoleList2.add(role);
            }
        });
        System.out.println(validRoleList2);
    }
}
