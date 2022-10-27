package j10_접근지정자;



public class AccessModifuerMain {
    public static void main(String[] args) {
        StudentAccessModifier sam = new StudentAccessModifier(202220001, "김규민");
        sam.showinfo();
        sam.setName("김규헌");
        sam.showinfo();

        System.out.println(sam.getCode());

    }
}
