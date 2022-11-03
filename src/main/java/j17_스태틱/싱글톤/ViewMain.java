package j17_스태틱.싱글톤;

import j17_스태틱.Product;

public class ViewMain {
    public static void main(String[] args) {
        ProductView.getInstance().showMainView();
        ProductView.getInstance().showOrderView();
    }
}
