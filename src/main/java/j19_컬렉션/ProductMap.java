package j19_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@AllArgsConstructor
@Data
class ProductImg {
    private int imgCode;
    private String imgName;
}

public class ProductMap {
    public static void main(String[] args) {
        Map<String, Object> product = new HashMap<String, Object>();
        product.put("productCode",1);
        product.put("productName","스타벅스 텀블러");
        product.put("productColor","Blak");
        product.put("productSize","Venti");

        List<ProductImg> productImgs = new ArrayList<ProductImg>();
        productImgs.add(new ProductImg(1,"starbucks_black_tumbler1.png"));
        productImgs.add(new ProductImg(2,"starbucks_black_tumbler2.png"));
        productImgs.add(new ProductImg(3,"starbucks_black_tumbler3.png"));
        productImgs.add(new ProductImg(4,"starbucks_black_tumbler4.png"));
        product.put("productImg",productImgs);
        System.out.println(product);
        /*
        * 텀블러 이미지1:starbucks_black_tumbler1.png
        * 텀블러 이미지2:starbucks_black_tumbler2.png
        * 텀블러 이미지3:starbucks_black_tumbler3.png
        * 텀블러 이미지4:starbucks_black_tumbler4.png*/
        List<ProductImg> productImgList = (List<ProductImg>) product.get("productImg");//흐어어어 이렇게 응용하기는 내멀리가 딸려
        for (ProductImg img : productImgList) {
            System.out.println("텀블러 이미지 :" + img.getImgCode() +":"+ img.getImgName());
        }
    }
}
