package chap_05;

import java.sql.Array;

public class _01_Array {
    public static void main(String[] args) {
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss + " 하나");
        System.out.println(coffeeRachel + " 하나");
        System.out.println(coffeeChandler + " 하나");
        System.out.println(coffeeMonica + " 하나");
        System.out.println("주세요");


//        String[] coffees = new String[4];
//
////        String coffees[] = new String[4];
//        coffees[0] = "아메리카노";
//        coffees[1] = "카페모카";
//        coffees[2] = "라떼";
//        coffees[3] = "카푸치노";

        //String[] coffees = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};


        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        System.out.println("---------------------------");

        System.out.println(coffees[0] + " 하나");
        System.out.println(coffees[1] + " 하나");
        coffees[2] = "에스프레소";
        System.out.println(coffees[2] + " 하나");
        System.out.println(coffees[3] + " 하나");
        System.out.println("주세요");

        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;

        double[] d = new double[] {10.0, 11.1, 12.2};
        boolean[] b = {true, true, false};
    }
}
