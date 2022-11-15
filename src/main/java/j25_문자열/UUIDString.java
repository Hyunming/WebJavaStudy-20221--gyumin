package j25_문자열;

import java.util.UUID;

public class UUIDString {
    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        int i = uuid.length()/2;
        String str= uuid.substring(0,i);
        String str2 = uuid.substring(i);

        System.out.println(str);
        System.out.println(str2);



    }
}
