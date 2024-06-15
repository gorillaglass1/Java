package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        String busID;
        int arriveMinute;
        float remainingDistance;

        busID = "상암08";
        arriveMinute = 3;
        remainingDistance = 1.2f;

        System.out.println(busID + "번 버스");
        System.out.println("약 " + arriveMinute + "분 후 도착");
        System.out.println("남은 거리 " + remainingDistance + "km");
    }
}
