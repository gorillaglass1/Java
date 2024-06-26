package chap_10;

import chap_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
        //converter.convert(2);

        //convertUSD((USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + "원"), 1);}
        Convertible convertible = (USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
        convertUSD(convertible, 2);

        ConvertibleWithNoParams c1 = () -> System.out.println("1 달러 = 1400 원");
        c1.convert();

        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + " 달러 = " + (USD * KRW) + " 원");
        };
        c1.convert();

        ConvertibleWithTwoParams c2 = (D, W) -> System.out.println(D + " 달러 = " + (D * W) + " 원");
        c2.convert(10, 1400);

        ConvertibleWithReturn c3 = (D, W) -> D * W;
        int result = c3.convert(20, 1400);
        System.out.println("20 달러 = " + result + "원");
    }

    public static void convertUSD(Convertible converter, int USD) {
        converter.convert(USD);
    }
}
