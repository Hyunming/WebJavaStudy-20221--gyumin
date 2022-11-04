package j17_스태틱.싱글톤;

import lombok.Getter;

public class Samsung {
@Getter//이렇게 주면
    private String company;
    private int serialNumber;
    private static Samsung instance = null;//주소안애 들어있는 매소드 변수 전부다 재활용가능
    private Samsung(){
        company = getClass().getSimpleName();
        serialNumber = 20220000;
    }
    public static Samsung getInstance() {//이렇게 쓰는게 싱글톤 하나의 생성자주소를가지고 돌려쓰는것
        if ( instance == null) {
            instance = new Samsung();
        }
        return instance;
    }

    public String createSerialNumber(String model){
        return model +"_"+ ++serialNumber;
    }
}
