package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";
        //b1.resolution = "FHD";
        b1.setPrice(200000);
        b1.color = "블랙";

        b1.setPrice(-5000);
        System.out.println("가격 : " + b1.getPrice() + "원");

        System.out.println("해상도 : " + b1.resolution);

        System.out.println("-----------");

        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution());

    }
}
