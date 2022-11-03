package j17_스태틱;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;


@Data
public class Product {
    public static int autoIncrement = 20220000;//생성되도 증가된값 유지 static은 공유영역 다른 생성자에가도 유지 복사 됮;않고 계속쓰임 static영역은 복사되지않음
    private int serialNumber;
    private String productName;
    public Product(String productName) {
        serialNumber = ++autoIncrement;
        this.productName=productName;



    }

    public static int getAutoIncrement() {
        return autoIncrement;
    }
    public static void printInfo(){//스태틱 메소드 안에서는 스태틱만 사용가능 // 메모리 할당이 안되어있기 떄문이다
        //System.out.println(productName);// 맵버변수는 스태틱 메소드에서 사용할 수 없다
        Product product = new Product("product");
        System.out.println(product.productName);//단 생성해서 쓰는건 가능하다
        System.out.println(autoIncrement);
    }

}
