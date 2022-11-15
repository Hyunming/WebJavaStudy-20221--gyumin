package j25_문자열;

import java.util.ArrayList;
import java.util.List;

public class String1 {
    public static void main(String[] args) {
        String filePast = "C:/Users/junil/java-study/src/main/java/String.java";
        String filePast2 = "C:/Users/junil/project/java-study2/src/main/java/Integer.java";
//        String projectName = null;
//        String fileName = null;
//        String extension = null;
        /*subString() -> 문자열을 잘라준다-> 내가찾는 문자열의 위치 인덱스 반환
        * indexOf()*/
        int srcIndex = filePast.indexOf("/src");
        String projectPath = filePast.substring(0, srcIndex);
 //       System.out.println(projectPath);
        String projectName = projectPath.substring(projectPath.lastIndexOf("/") + 1);
        String fileName = filePast.substring(filePast.lastIndexOf("/")+1,filePast.lastIndexOf("."));
        String extension = filePast.substring(filePast.lastIndexOf("."));
        System.out.println("프로젝트명: "+projectName);
        System.out.println("파일명: " +fileName);
        System.out.println("확장자명: " +extension);

//        a =filePast2.indexOf(str2);
//        if (a!= -1) {
//        fileName = filePast2.substring(a,a+str2.length());
//        }else {
//            System.out.println("그런거 없어");
//        }
//        a =filePast2.indexOf(str3);
//        if (a != -1) {
//        extension = filePast2.substring(a,a+str3.length());
//        }else {
//            System.out.println("없어");
//        }







    }
}
