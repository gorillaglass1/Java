package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number) {
//        int result = number * number;
//        return result;
        return  getPower(number, 2);
    }


    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 2;
        }
        System.out.println(getPower(2, 2));

        result = 1;
        for (int i = 0; i < 3; i++) {
            result *= 3;
        }
        System.out.println(getPower(3,3));

        result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 4;
        }
        System.out.println(getPower(4, 2));
    }
}
