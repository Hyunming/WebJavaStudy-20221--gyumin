package j22_람다;
@FunctionalInterface//이건 람다에서 쓰는거다 추상메소드가 2개가 되지않게 미리 알려주는것
public interface Operation {
    public int calc(int x,int y);
    public default String resultToString(int result){
        return "결과: " + result;
    }
}
