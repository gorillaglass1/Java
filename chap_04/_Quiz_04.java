package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int carCharge = 0;
        final int charge = 4000;
        final int max = 30000;
        int hour = 5;
        boolean lightCar = false;
        boolean disabledCar = false;

        if ((charge * hour) < max)
            carCharge = charge * hour;
        else
            carCharge = max;

        if (lightCar || disabledCar)
            carCharge *= 0.5f;

        System.out.println("주차 요금은 " + carCharge + "원 입니다.");
    }
}
