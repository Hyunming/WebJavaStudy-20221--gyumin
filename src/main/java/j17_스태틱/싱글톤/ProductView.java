package j17_스태틱.싱글톤;

public class ProductView {//객체를 하나만 쓸수있게 하는것 그래서 싱글 톤인듯 static을 쓰니깐 계속 같은주소를 돌려줌
    private static ProductView instance = null;
    private ProductView() {}
    public static ProductView getInstance() {//이렇게 쓰는게 싱글톤 하나의 생성자주소를가지고 돌려쓰는것
        if (instance == null) {
            instance = new ProductView();
        }
        return instance;
    }

    public void showMainView() {
        System.out.println("상품 정보를 보여주는 메인 화면");
    }
    public void showOrderView() {
        System.out.println("주문 정보를 보여주는 화면");
    }
}
