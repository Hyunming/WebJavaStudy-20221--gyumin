package j25_문자열;

public class String3 {
    public static void main(String[] args) {
        String phoneNumber = "010-9988-1916";

        String replacePhoneNumber =
                phoneNumber.replaceAll("-", "")
                        .replaceAll("/","")
                        .replaceAll(" ","");// - 를 모두 찾아서 모두" " 로 봐꾸어라
        String replacePhoneNumber2 = phoneNumber.replaceFirst("-", " ");// - 를 찾아서 가장처음것만 " " 로 봐꾸어라
        System.out.println(replacePhoneNumber);
    }
}
