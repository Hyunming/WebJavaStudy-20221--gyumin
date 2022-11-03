package j17_스태틱;

import j08_메소드.Method1;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductMain {
    private String name;
    public static void main(String[] args){// 이것도 스태틱이었음 ㅋㅋ
        int autoIncrement = Product.getAutoIncrement();//스태틱은 스태틱 매모리 영역이ㄸ로있다
        System.out.println(autoIncrement);
        System.out.println(Product.autoIncrement);
        Product.autoIncrement++;
        System.out.println(Product.autoIncrement);

        Product p1 = new Product("p1");//생성자호출때 1증가
        System.out.println(p1.getAutoIncrement());
        Product p2 = new Product("p2");
        System.out.println(p2.getAutoIncrement());
        System.out.println(Product.getAutoIncrement());
        System.out.println(PathRepository.PRODUCT_IMG_PATH);//구지 이런 방식이아니라도 static을 이렇게 활용할수있다

        Product.printInfo();//생성하지않고도 사용이 가능하다
        //ProductMain.main(new String[] {});//루프가 돈다
        ProductMain productMain = new ProductMain();
        productMain.setName("테스트");
        System.out.println(productMain.getName());
        Method1.main(new String[] {});
        Method1.call();



























//        Product[] products = new Product[5];
//
//
//        /*1. serialNumber = 20220001, productName = "스타벅스 블랙 텀블러1
//        * 2. serialNumber = 20220002, productName = "스타벅스 블랙 텀블러2
//        * 3. serialNumber = 20220003, productName = "스타벅스 블랙 텀블러3
//        * 4. serialNumber = 20220004, productName = "스타벅스 블랙 텀블러4
//        * 5. serialNumber = 20220005, productName = "스타벅스 블랙 텀블러5*/
//        products[0] = new Product("스타벅스 블랙 텀블러"+1);
//        products[1] = new Product("스타벅스 블랙 텀블러"+2);
//        products[2] = new Product("스타벅스 블랙 텀블러"+3);
//        products[3] = new Product("스타벅스 블랙 텀블러"+4);
//        products[4] = new Product("스타벅스 블랙 텀블러"+5);
//        for (int i = 0; i < products.length; i++) {
//            System.out.println(products[i]);
//        }
    }
}
